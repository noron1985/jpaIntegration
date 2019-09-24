package com.ronald.oneToManyUni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue
    private Long id;
    private String number;

    public Phone(String number) {
        this.number = number;
    }
    protected Phone() {}
}
