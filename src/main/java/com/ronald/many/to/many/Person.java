package com.ronald.many.to.many;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    @ManyToMany
    @OrderBy("firstName asc , lastName asc ")
    @JoinTable(name = "appointment_person",
            joinColumns = {@JoinColumn(name = "appointment_id")},
            inverseJoinColumns = {@JoinColumn(name = "person_id")})
    private Collection<Appointment> appointments;

    public Person() {
    }

    public Person(String firstName, String lastName, Collection<Appointment> appointments) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.appointments = appointments;
    }
}
