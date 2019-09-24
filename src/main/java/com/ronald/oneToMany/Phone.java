package com.ronald.oneToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

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
