package com.myProject.DAO.Activity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Activity.Comment;

public interface CommentDAO extends JpaRepository<Comment, Integer> {

}
