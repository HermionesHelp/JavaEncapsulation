package com.company;

public class Person {
    // Notice that our properties are now private
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // these methods are now specific "getters" instead of methods called "print"
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getInitials() {
        return this.firstName.substring(0, 1) + "." + this.lastName.substring(0, 1) + ".";
    }

    // Create getters for the firstName, lastName, and age properties


    // Create setters for the firstName, and lastName properties

    // Create a method called haveBirthday that increments the age property by 1

}