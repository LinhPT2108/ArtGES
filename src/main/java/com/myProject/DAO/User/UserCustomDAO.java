package com.myProject.DAO.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.User.UserCustom;

public interface UserCustomDAO extends JpaRepository<UserCustom, String>{

}
