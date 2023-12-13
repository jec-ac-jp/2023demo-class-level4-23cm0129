package com.classroom.assignment.model.request;

public class Student {
  private String id;
  private String name;
  private String subject;

  public Student(String id, String name, String subject) {
    this.setId(id);
    this.setName(name);
    this.setSubject(subject);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


}
