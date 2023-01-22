package com.rickandmortyapp.dto.mapper;

import com.rickandmortyapp.dto.CharacterResponseDto;
import com.rickandmortyapp.dto.external.ApiCharacterDto;
import com.rickandmortyapp.model.Gender;
import com.rickandmortyapp.model.MovieCharacter;
import com.rickandmortyapp.model.Status;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MovieCharacterMapperTest {
    private static final MovieCharacterMapper mapper = new MovieCharacterMapper();
    private static final ApiCharacterDto apiCharacterDto =
            new ApiCharacterDto(1L, "Rick", Status.ALIVE.toString(), Gender.MALE.toString());
    private static final MovieCharacter model =
            new MovieCharacter(1L, 1L, "Bob", Status.ALIVE, Gender.MALE);

    @Test
    public void mapToModelFromApiCharacterResponseDto_Ok() {
        MovieCharacter expected = new MovieCharacter();
        expected.setName(apiCharacterDto.getName());
        expected.setGender(Gender.valueOf(apiCharacterDto.getGender().toUpperCase()));
        expected.setStatus(Status.valueOf(apiCharacterDto.getStatus().toUpperCase()));
        expected.setExternalId(apiCharacterDto.getId());

        MovieCharacter actual = mapper.parseApiCharacterResponseDto(apiCharacterDto);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mapToCharacterResponseDtoFromModel_Ok() {
        CharacterResponseDto expected =
                new CharacterResponseDto(model.getId(),
                        model.getExternalId(),
                        model.getName(),
                        model.getStatus(),
                        model.getGender());
        CharacterResponseDto actual = mapper.toResponseDto(model);
        Assert.assertEquals(expected, actual);
    }


}