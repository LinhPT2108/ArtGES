package com.myProject.DAO.Promotion;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Promotion.Invoice;

public interface InvoiceDAO extends JpaRepository<Invoice, Integer>{

}
