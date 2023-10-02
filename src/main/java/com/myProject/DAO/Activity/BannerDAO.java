package com.myProject.DAO.Activity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Activity.Banner;

public interface BannerDAO extends JpaRepository<Banner, Integer> {

}
