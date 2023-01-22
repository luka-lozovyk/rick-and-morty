package com.rickandmortyapp.dto.external;

import lombok.Data;

@Data
public class ApiCharacterDto {
    private Long id;
    private String name;
    private String status;
    private String gender;

    public ApiCharacterDto(Long id, String name, String status, String gender) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.gender = gender;
    }
}
