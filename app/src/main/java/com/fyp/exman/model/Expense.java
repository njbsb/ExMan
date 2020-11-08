package com.fyp.exman.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Expense {
    private String expenseID;
    private Date date;
    private ExpenseCategory expenseCategory;
    private ShareGroup shareGroup;
    private double amount;

    public Expense(ExpenseCategory expenseCategory, ShareGroup shareGroup, double amount) {
        this.expenseCategory = expenseCategory;
        this.shareGroup = shareGroup;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getExpenseID() {
        return expenseID;
    }

    public void setExpenseID(String expenseID) {
        this.expenseID = expenseID;
    }

    public Date getDate() {
        return date;
    }

    public String getStringDate() {
        return new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public ShareGroup getShareGroup() {
        return shareGroup;
    }

    public void setShareGroup(ShareGroup shareGroup) {
        this.shareGroup = shareGroup;
    }
}
