package com.ronald.manyToOneUni;

import javax.persistence.*;

@Entity
@Table(name = "journey")
public class Journey {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.MERGE)//Merge fait un update avec Hibernate
    @JoinColumn(name = "ship_id")
    private Ship ship;

    public Journey() {
    }

    public Journey(String name, Ship ship) {
        this.name = name;
        this.ship = ship;
    }
}

