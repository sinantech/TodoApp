package dev.deerops.todoapp.model.dto.request;

import jakarta.validation.constraints.NotBlank;


public record CreateToDoRequest(@NotBlank String title, @NotBlank String description) {

    public CreateToDoRequest {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be blank");
        }
    }
}
