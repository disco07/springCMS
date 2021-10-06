package com.springcms.cms.Service;

import com.springcms.cms.Entity.Invoices;
import com.springcms.cms.Repository.InvoicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InvoicesServiceImpl implements InvoicesService{

    @Autowired
    public InvoicesRepository invoicesRepository;

    @Override
    public List<Invoices> findAll() {
        List<Invoices> invoices = new ArrayList<>(invoicesRepository.findAll());
        return invoices;
    }

    @Override
    public Optional<Invoices> findById(Long id) {
        return invoicesRepository.findById(id);
    }

    @Override
    public Invoices createFrenchRadar(Invoices invoices) {
        return invoicesRepository.save(invoices);
    }

    @Override
    public void putInvoice(Invoices invoice) {

    }

    @Override
    public void deleteInvoice(Long id) {

    }
}
