package com.kaaddevelopers.myprescriptor.cores;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String nationality;
    private String phone;
    private int age;

    public User(String firstName, String lastName, String username, String email, String nationality, String phone, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.nationality = nationality;
        this.phone = phone;
        this.age = age;
    }

    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("firstName", firstName);
        map.put("lastName", lastName);
        map.put("username", username);
        map.put("nationality", nationality);
        map.put("phone", phone);
        map.put("age", Integer.toString(age));
        map.put("email", email);
        return map;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
