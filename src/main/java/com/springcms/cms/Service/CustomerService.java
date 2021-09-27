package com.springcms.cms.Service;

import com.springcms.cms.Entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);
}
