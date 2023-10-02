package com.myProject.DAO.Activity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Activity.WishList;

public interface WishListDAO extends JpaRepository<WishList, Integer> {

}
