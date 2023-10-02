package com.myProject.DAO.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.User.Role;

public interface RoleDAO extends JpaRepository<Role, String>{

}
