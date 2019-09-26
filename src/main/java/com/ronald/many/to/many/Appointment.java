package com.ronald.many.to.many;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToMany(mappedBy = "appointments")
    private Collection<Person> personList;

    public Appointment() {
    }

    public Appointment(Collection<Person> personList, Date date) {
        this.personList = personList;
        this.date = date;
    }

    public Appointment(Date date) {
        this.date = date;
    }
}
