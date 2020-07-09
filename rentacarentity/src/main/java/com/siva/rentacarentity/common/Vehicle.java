package com.siva.rentacarentity.common;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
@Data
public class Vehicle {

    @Id
    private int id;

    private String make;

    private String model;

    private String type;
    private int year;
}
