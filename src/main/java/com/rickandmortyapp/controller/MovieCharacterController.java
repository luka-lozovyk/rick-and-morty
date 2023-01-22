package com.rickandmortyapp.controller;

import com.rickandmortyapp.dto.CharacterResponseDto;
import com.rickandmortyapp.dto.mapper.MovieCharacterMapper;
import com.rickandmortyapp.model.MovieCharacter;
import com.rickandmortyapp.service.MovieCharacterService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-characters")
public class MovieCharacterController {
    private final MovieCharacterService characterService;
    private final MovieCharacterMapper mapper;

    public MovieCharacterController(MovieCharacterService movieCharacterService,
                                    MovieCharacterMapper mapper) {
        this.characterService = movieCharacterService;
        this.mapper = mapper;
    }

    @GetMapping("/random")
    @ApiOperation(value = "Returns info about random character")
    public CharacterResponseDto getRandom() {
        MovieCharacter randomCharacter = characterService.getRandomCharacter();
        return mapper.toResponseDto(randomCharacter);
    }

    @GetMapping("/by-name")
    @ApiOperation(value = "Returns list of characters, who`s name contains part")
    public List<CharacterResponseDto> findAllByName(@RequestParam("namePart") String namePart) {
        return characterService.findAllByNameContains(namePart).stream()
                .map(mapper::toResponseDto)
                .collect(Collectors.toList());
    }
}
