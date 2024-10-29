package org.example.domain.task;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private UUID taskId;
    private Integer commentId;
    private String content;
    private String author;

    public Comment(String author, String content) {
        this.content = content;
        this.author = author;
    }
}
