package com.myProject.DAO.Activity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Activity.Cart;

public interface CartDAO extends JpaRepository<Cart, Integer> {

}
