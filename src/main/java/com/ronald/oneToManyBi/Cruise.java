package com.ronald.oneToManyBi;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cruise")
public class Cruise {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "cruise_id")
    private List<Reservation> reservations;

    public Cruise() {
    }

    public Cruise(String name, List<Reservation> reservations) {
        this.name = name;
        this.reservations = reservations;
    }
}
