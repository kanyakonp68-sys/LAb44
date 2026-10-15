package com.example.lab4;

// Abstraction: ใช้ abstract class
public abstract class Note {
    // Encapsulation: กำหนด attributes เป็น private
    private String title;
    private String createdDate;

    // Constructor
    public Note(String title, String createdDate) {
        this.title = title;
        this.createdDate = createdDate;
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    // Abstraction & Polymorphism: ประกาศ abstract method
    public abstract void getSummary();
}
