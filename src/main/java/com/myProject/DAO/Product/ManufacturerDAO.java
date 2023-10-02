package com.myProject.DAO.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Product.Manufacturer;

public interface ManufacturerDAO extends JpaRepository<Manufacturer, Integer>{

}
