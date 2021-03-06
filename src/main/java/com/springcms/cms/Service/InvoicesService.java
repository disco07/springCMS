package com.springcms.cms.Service;

import com.springcms.cms.Entity.Invoices;

import java.util.List;
import java.util.Optional;

public interface InvoicesService {

    List<Invoices> findAll();

    Optional<Invoices> findById(Long id);

    Invoices createFrenchRadar(Invoices invoices);

    void putInvoice(Invoices invoice);

    void deleteInvoice(Long id);
}
