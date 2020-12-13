/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Library.code;

/**
 *
 * @author USER
 */
public class User_code {

    private String name;
    private String id;
    private String department;
    private String semester;
    private String email;
    private String phone;
    private String book_id;
    private String book_title;
    private String date;
    private String edition;
    private String quantity;

    public User_code(String name, String id, String department, String semester, String email, String phone, String book_id, String book_title, String date, String edition,String quantity) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.semester = semester;
        this.email = email;
        this.phone = phone;
        this.book_id = book_id;
        this.book_title = book_title;
        this.date = date;
        this.edition = edition;
        this.quantity = quantity;
    }
    
    
    public void set_user(String name, String id, String department, String semester, String email, String phone, String book_id, String book_title, String date, String edition) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.semester = semester;
        this.email = email;
        this.phone = phone;
        this.book_id = book_id;
        this.book_title = book_title;
        this.date = date;
        this.edition = edition;
    }
    
    
    

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getSemester() {
        return semester;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getBook_id() {
        return book_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public String getDate() {
        return date;
    }

    public String getEdition() {
        return edition;
    }

    public String getQuantity() {
        return quantity;
    }
    
    

}
