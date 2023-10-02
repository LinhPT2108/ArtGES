package com.myProject.DAO.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Product.Price;

public interface PriceDAO extends JpaRepository<Price, Integer>{

}
