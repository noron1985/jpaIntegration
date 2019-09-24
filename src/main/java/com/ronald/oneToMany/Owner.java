package com.ronald.oneToMany;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "owner")
public class Owner {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "owner_phone",
            joinColumns = {@JoinColumn(name = "customer_id")},
            inverseJoinColumns ={@JoinColumn(name = "phone_id")})
    private Collection<Phone> phones;

    public Owner(){}

    public Owner(String name, Collection<Phone> phones) {
        this.name = name;
        this.phones = phones;
    }
}
