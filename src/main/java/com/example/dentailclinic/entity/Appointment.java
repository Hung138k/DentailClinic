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
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentID;

    @Column(name = "patient_id")
    private Long patientID;

    @Column(name = "booking_date")
    private Date bookingDate;

    @Column(name = "note")
    private String note;

    @Column(name = "doctor_id")
    private Long doctorID;

}
