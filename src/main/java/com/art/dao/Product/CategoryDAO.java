package com.art.DAO.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.art.Entities.Product.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer>{

}
