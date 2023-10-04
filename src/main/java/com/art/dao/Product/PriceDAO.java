package com.art.DAO.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.art.Entities.Product.Price;

public interface PriceDAO extends JpaRepository<Price, Integer>{

}
