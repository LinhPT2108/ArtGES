package com.myProject.DAO.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Product.Image;

public interface ImageDAO extends JpaRepository<Image, Integer>{

}
