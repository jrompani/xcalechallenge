package com.xcalechallenge.app.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class GroupRequestDto {
    @NotBlank
    @NotEmpty
    private String name;
    @NotEmpty
    private List<Long> membersId;
}
