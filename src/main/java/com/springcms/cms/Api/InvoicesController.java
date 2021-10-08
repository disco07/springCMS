package com.springcms.cms.Api;

import com.springcms.cms.Entity.Invoices;
import com.springcms.cms.Service.InvoicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/invoices")
public class InvoicesController {

    @Autowired
    public InvoicesService invoicesService;

    @GetMapping
    public ResponseEntity findAll() {
        List<Invoices> invoices;
        invoices = invoicesService.findAll();
        return new ResponseEntity(invoices, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Optional<Invoices> invoice;
        invoice = invoicesService.findById(id);
        if (!invoice.isPresent()) {
            return new ResponseEntity("Invoice not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(invoice.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createInvoice(@RequestBody @Valid Invoices invoice) {
        invoicesService.createFrenchRadar(invoice);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity putInvoice(@RequestBody Invoices invoices, @PathVariable("id") Long id) {
        Optional<Invoices> invoice = invoicesService.findById(id);
        if (!invoice.isPresent()){
            return new ResponseEntity("Cette facture n'existe pas", HttpStatus.BAD_REQUEST);
        }
        invoicesService.putInvoice(invoices);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteInvoice(@PathVariable("id") Long id) {
        Optional<Invoices> invoice = invoicesService.findById(id);
        if (!invoice.isPresent()){
            return new ResponseEntity("Cette facture n'existe pas", HttpStatus.BAD_REQUEST);
        }
        invoicesService.deleteInvoice(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
