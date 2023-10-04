package com.art.DAO.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.art.Entities.Product.Product;

public interface ProductDAO extends JpaRepository<Product, String>{

}
