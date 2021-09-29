package com.springcms.cms.Entity;

import javax.persistence.*;
import java.util.*;
import java.util.stream.Stream;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String company;
    @ManyToOne
    private User user;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Invoices> invoices = new ArrayList<>();

    public float getTotalAmount() {
        float total = 0;
        for (Invoices invoice:invoices) {
            total += invoice.getAmount();
        }
        return total;
    }

    public float getUnpaidAmount() {
        float total = 0;
        for (Invoices invoice:invoices) {
            total += Objects.equals(invoice.getStatus(), "CANCELLED") || Objects.equals(invoice.getStatus(), "PAID") ? 0 : invoice.getAmount();
        }
        return total;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
