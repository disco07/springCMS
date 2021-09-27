package com.springcms.cms.Service;

import com.springcms.cms.Entity.Invoices;
import com.springcms.cms.Repository.InvoicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public Invoices findById(Long id) {
        return invoicesRepository.findById(id).get();
    }
}
