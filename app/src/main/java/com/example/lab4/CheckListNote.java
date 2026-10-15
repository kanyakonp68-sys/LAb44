package com.example.lab4;

import java.util.List;

// Inheritance: สืบทอดจาก Note
public class CheckListNote extends Note {
    private List<String> items;

    public CheckListNote(String title, List<String> items, String createdDate) {
        super(title, createdDate);
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    // Polymorphism: Override เมธอด getSummary()
    @Override
    public void getSummary() {
        System.out.println("[CheckList Note] " + getTitle() + " (" + getCreatedDate() + ")");
        if (items != null) {
            for (String item : items) {
                System.out.println("  - [ ] " + item);
            }
        }
    }
}
