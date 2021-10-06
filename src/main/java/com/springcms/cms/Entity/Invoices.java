package com.springcms.cms.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "Le montant est obligatoire")
    private float amount;
    @NotBlank(message = "La date ne doit pas être vide")
    private LocalDateTime sentAt;
    @NotBlank(message = "Le status est obigatoire")
    private String status;
    @ManyToOne
    @NotBlank(message = "Le client doit être renseigné")
    private Customer customer;
    @NotBlank(message = "Il faut absolument une facture")
    private int chrono;

    public Invoices() {
    }

    public Long getId() {
        return id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getChrono() {
        return chrono;
    }

    public void setChrono(int chrono) {
        this.chrono = chrono;
    }
}
