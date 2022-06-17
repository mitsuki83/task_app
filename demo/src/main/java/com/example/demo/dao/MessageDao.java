package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EntForm;


@Repository
public class MessageDao {
  
  private final JdbcTemplate db;

  @Autowired
  public MessageDao(JdbcTemplate db){
    this.db = db;
  }

  public void insertDb(EntForm entForm){
    this.db.update("INSERT INTO sample (title) VALUES(?)",entForm.getTitle());
  }
}
