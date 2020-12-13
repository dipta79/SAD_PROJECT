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
public class Book_code {
    
    private String title;
    private String id;
    private String edition;
    private String quantity;

    public Book_code(String title, String id, String edition, String quantity) {
        this.title = title;
        this.id = id;
        this.edition = edition;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getEdition() {
        return edition;
    }

    public String getQuantity() {
        return quantity;
    }
    
    
    
}
