package com.art.DAO.Activity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.art.Entities.Activity.WishList;

public interface WishListDAO extends JpaRepository<WishList, Integer> {

}