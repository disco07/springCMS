package com.springcms.cms.Repository;

import com.springcms.cms.Entity.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoicesRepository extends JpaRepository<Invoices, Long> {
}
