package com.art.DAO.Promotion;

import org.springframework.data.jpa.repository.JpaRepository;

import com.art.Entities.Promotion.Invoice;

public interface InvoiceDAO extends JpaRepository<Invoice, Integer>{

}