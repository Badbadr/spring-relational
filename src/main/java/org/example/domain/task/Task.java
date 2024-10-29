package org.example.domain.task;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.domain.project.Project;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
public class Task extends AbstractAggregateRoot<Task> {

    @Id
    private UUID id;
    private AggregateReference<Task, UUID> project;
    @MappedCollection(idColumn = "task_id", keyColumn = "comment_id")
    private Collection<Comment> comments = new ArrayList<>();
    private String name;

    public Task(String name) {
        this.name = name;
        this.project = null;
    }

    public Task(String name, Project project) {
        this.name = name;
        this.project = AggregateReference.to(project.getId());
    }

    public void addComment(String author, String text) {
        this.comments.add(new Comment(author, text));
    }
}
