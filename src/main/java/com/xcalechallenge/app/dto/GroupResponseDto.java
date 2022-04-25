package com.xcalechallenge.app.dto;

import java.util.List;

import lombok.Data;

@Data
public class GroupResponseDto {

    private Long id;
    private String name;
    private List<ContactResponseDto> contacts;
}
