package com.art.DAO.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.art.Entities.User.Role;

public interface RoleDAO extends JpaRepository<Role, String>{

}
