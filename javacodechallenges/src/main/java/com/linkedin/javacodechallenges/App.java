package com.linkedin.javacodechallenges;

public class App {
    public static void main(String[] args) {
        Person onePerson = new Person();

        onePerson.setFirstName("serge");
        onePerson.setLastName("Beauregard");
        System.out.println(onePerson.message());
    }
}
