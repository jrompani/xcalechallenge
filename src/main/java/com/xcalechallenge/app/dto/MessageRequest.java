package com.xcalechallenge.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MessageRequest {
    @NotNull
    private Long groupId;
    @NotBlank
    private String text;
    @NotNull
    private Long senderId;
}
