package com.siva.rentacarentity.common;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Customer {

    @Id
    private int id;

    private String firstName;
    private String lastName;

    private String dlNumber;
    private String zipcode;
}
