package com.rickandmortyapp.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "movie_character")
public class MovieCharacter {
    @Id
    @GeneratedValue(generator = "movie_character_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "movie_character_id_seq",
            sequenceName = "movie_character_id_seq",
            allocationSize = 1)
    private Long id;
    private Long externalId;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public MovieCharacter(Long id, Long externalId, String name, Status status, Gender gender) {
        this.id = id;
        this.externalId = externalId;
        this.name = name;
        this.status = status;
        this.gender = gender;
    }
}
