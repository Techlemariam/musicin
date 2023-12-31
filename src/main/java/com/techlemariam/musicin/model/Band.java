package com.techlemariam.musicin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Entity
public class Band {
    private String name;
    private String creationYear;
    private List<Genre> genre;
    @OneToMany
    private List<Musician> musicians;

}
