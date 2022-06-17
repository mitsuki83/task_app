package com.example.demo.entity;

public class EntForm {
  
  private Long id;
  private String title;
  private String detail;
  private boolean done;

  public EntForm(){ }

  //ゲッター
  public Long getId(){return id;}
  public String getTitle(){return title;}
  public String getDetail(){return detail;}

  //セッター
  public void setId(Long id){this.id=id;}
  public void setTitle(String title){this.title=title;}
  public void setDetail(String detail){this.detail=detail;}
}
