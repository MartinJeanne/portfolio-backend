package com.martinjeanne.portfolio_backend.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class ContactMessageDto {
    @NotNull
    private String author;
    @NotNull
    private String message;
}
