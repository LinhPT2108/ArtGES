package com.art.DAO.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.art.Entities.User.UserCustom;

public interface UserCustomDAO extends JpaRepository<UserCustom, String>{

}
