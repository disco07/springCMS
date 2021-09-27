package com.springcms.cms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Invoices {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private float amount;
    private LocalDateTime sentAt;
    private String status;
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

    public int getChrono() {
        return chrono;
    }

    public void setChrono(int chrono) {
        this.chrono = chrono;
    }
}
