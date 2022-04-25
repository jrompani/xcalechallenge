package com.xcalechallenge.app.dto;

import java.util.List;

import lombok.Data;

@Data
public class MessageResponse {

    private Long id;
    private String name;
    private List<ContactResponseDto> members;
}
