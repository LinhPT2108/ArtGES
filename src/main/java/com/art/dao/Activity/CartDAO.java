package com.art.DAO.Activity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.art.Entities.Activity.Cart;

public interface CartDAO extends JpaRepository<Cart, Integer> {

}
