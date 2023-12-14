package com.techlemariam.musicin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Entity
public class Musician {
    @OneToMany(mappedBy = "FORMER_BANDS")
    private List<Band> formerBands;
    @OneToMany(mappedBy = "CURRENT_BANDS")

    private List<Band> currentBands;
    @OneToMany(mappedBy = "CURRENT_BANDS")
    private List<Instrument> instruments;
    private LocalDate birthDate ;

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

}
