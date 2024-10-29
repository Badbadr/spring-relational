package org.example.domain.project;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Project extends AbstractAggregateRoot<Project> {

    @Id
    private UUID id;
    private String name;

    public Project(String name) {
        this.name = name;
    }
}
