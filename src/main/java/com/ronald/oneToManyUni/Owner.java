package com.ronald.oneToManyUni;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "owner")
public class Owner {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    // for many to many
    /*@JoinTable
    joinColumns = {@JoinColumn(name = "customer_id")},
    inverseJoinColumns ={@JoinColumn(name = "phone_id")}*/

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "owner_id")
    private Collection<Phone> phones;

    public Owner(){}

    public Owner(String name, Collection<Phone> phones) {
        this.name = name;
        this.phones = phones;
    }
}
