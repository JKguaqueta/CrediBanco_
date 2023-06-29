package com.example.credibanco.model;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private String cardNumber;
    private double amount;

    public Transaction(String transactionId, String cardNumber, double amount) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Object getCardId() {
        return null;
    }

    public LocalDateTime getTransactionTime() {
        return null;
    }

    public void setCancelled(boolean b) {
    }
}
