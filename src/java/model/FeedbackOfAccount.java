/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class FeedbackOfAccount {
    private String email;
    private String name;
    private int phone;
    private String title;

    public FeedbackOfAccount() {
    }

    public FeedbackOfAccount(String email, String name, int phone, String title) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "FeedbackOfAccount{" + "email=" + email + ", name=" + name + ", phone=" + phone + ", title=" + title + '}';
    }
    
    
}
