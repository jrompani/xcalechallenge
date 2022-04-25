package com.xcalechallenge.app.dto;

import lombok.Data;

@Data
public class ContactResponseDto {
    
	private Long id;
    private String phoneNumber;
    private String firstName;
    private String lastName;
}
