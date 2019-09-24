package com.ronald.oneToOneUni;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ADDRESS_ID",foreignKey = @ForeignKey(name="FK_Address_id")) // il creer la column address_id (case insensitive)
    // en générant les clés étrangères
    private Address address;

    public Customer(){}

    public Customer(Long id, Address address) {
        this.id = id;
        this.address = address;
    }

    public Customer(Address address){
        this.address = address;
    }


}
