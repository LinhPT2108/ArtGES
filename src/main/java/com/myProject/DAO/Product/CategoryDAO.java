package com.myProject.DAO.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Product.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer>{

}
