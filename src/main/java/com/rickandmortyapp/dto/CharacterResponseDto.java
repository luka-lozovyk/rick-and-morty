package com.rickandmortyapp.dto;

import com.rickandmortyapp.model.Gender;
import com.rickandmortyapp.model.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CharacterResponseDto {
    private Long id;
    private Long externalId;
    private String name;
    private Status status;
    private Gender gender;

    public CharacterResponseDto(Long id,
                                Long externalId,
                                String name,
                                Status status,
                                Gender gender) {
        this.id = id;
        this.externalId = externalId;
        this.name = name;
        this.status = status;
        this.gender = gender;
    }
}
