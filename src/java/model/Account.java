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
public class Account {
    private String userName;
    private String password;
    private int phone;
    private String email;
    private boolean isAdmin;
    private String schedule;
    
    public Account() {
    }

    public Account(String userName, String password, int phone, String email, boolean isAdmin, String schedule) {
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.isAdmin = isAdmin;
        this.schedule = schedule;
    }

    

    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    
    @Override
    public String toString() {
        return "Account{" + "userName=" + userName + ", password=" + password + ", phone=" + phone + ", email=" + email;
    }
    
}
