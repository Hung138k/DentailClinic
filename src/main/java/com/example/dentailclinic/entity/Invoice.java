package com.example.dentailclinic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Long invoiceId;

    @Column(name = "date")
    private Date date;

    @Column(name = "comment")
    private String comment;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "invoice_payment",
            joinColumns = @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id"),
            inverseJoinColumns = @JoinColumn(name = "payment_id", referencedColumnName = "payment_id")
    )
    private Set<Payment> payments;


}
