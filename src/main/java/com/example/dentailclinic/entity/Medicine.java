package com.example.dentailclinic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicine_id")
    private Long id;

    @Column(name = "medicine_name")
    private String medicineName;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "expiry_date")
    private Date expiry_date;

    @Column(name = "input_day")
    private Date input_day;

    @Column(name = "price")
    private Float price;

    @Column(name = "quantityInStock")
    private int quantityInStock;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "description")
    private String description;

    @Column(name = "unit")
    private String unit;
}
