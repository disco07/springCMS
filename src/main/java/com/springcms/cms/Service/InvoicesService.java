package com.springcms.cms.Service;

import com.springcms.cms.Entity.Invoices;

import java.util.List;

public interface InvoicesService {

    List<Invoices> findAll();

    Invoices findById(Long id);
}
