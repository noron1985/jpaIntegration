package com.ronald.oneToOneBi;

import javax.persistence.*;

@Entity
@Table(name = "credit_card")
public class CreditCard {

    @Id
    @GeneratedValue
    private Long id;

    private int cardNumber;

    @OneToOne(mappedBy = "creditCard")// reférénce une propriétés de java pas le nom de la colonne
    private Client client;

    public CreditCard() {}

    public CreditCard(Client client) {
        this.client = client;
    }

    public CreditCard(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CreditCard(int cardNumber, Client client) {
        this.cardNumber = cardNumber;
        this.client = client;
    }
}
