package org.example.user;

public class User {
    private String fullName;
    private int age;
    private char gender;

    public User(String fullName, int age, char gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getFormattedInfo() {
        String[] nameParts = fullName.split(" ");
        String formattedName = nameParts[0] + " ";
        for (int i = 1; i < nameParts.length; i++) {
            formattedName += nameParts[i].charAt(0) + ". ";
        }

        return formattedName + age + " " + gender;
    }
}
