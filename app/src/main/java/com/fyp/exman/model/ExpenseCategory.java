package com.fyp.exman.model;

public class ExpenseCategory {
    private String categoryID;
    private String category;

    public ExpenseCategory(String categoryID, String category) {
        this.categoryID = categoryID;
        this.category = category;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
