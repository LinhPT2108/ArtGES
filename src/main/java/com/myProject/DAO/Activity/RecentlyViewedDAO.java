package com.myProject.DAO.Activity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Activity.RecentlyViewed;

public interface RecentlyViewedDAO extends JpaRepository<RecentlyViewed, Integer> {

}
