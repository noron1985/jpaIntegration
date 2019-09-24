package com.ronald.manyToOneUni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ship")
public class Ship {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Ship(String name) {
        this.name = name;
    }
}
