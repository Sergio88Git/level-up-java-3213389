package com.linkedin.javacodechallenges;

public class Person {

  private String firstName;
  private String lastName;

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String message() {
    return ("My name is " + getFirstName() + " " + getLastName() +
        " and I'm an object.");

  }
}