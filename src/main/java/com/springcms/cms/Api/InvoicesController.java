package com.springcms.cms.Api;

import com.springcms.cms.Entity.Invoices;
import com.springcms.cms.Service.InvoicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoicesController {

    @Autowired
    public InvoicesService invoicesService;

    @GetMapping
    public List<Invoices> findAll() {
        return invoicesService.findAll();
    }
}
