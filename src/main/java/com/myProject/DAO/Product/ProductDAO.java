package com.myProject.DAO.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Product.Product;

public interface ProductDAO extends JpaRepository<Product, String>{

}
