package com.example.credibanco.Bussines;

public interface cardService<Transaction> {
    Card findByCardNumber(String cardNumber);
    void saveCard(Card card);
    void deleteCard(String cardNumber);
    Card generateCardNumber(String productId);
    void activateCard(String cardNumber);
    void blockCard(String cardNumber);
    void rechargeBalance(String cardNumber, double amount);
    double checkBalance(String cardNumber);
    Transaction makePurchase(String cardNumber, double price);
    Transaction cancelTransaction(String cardNumber, String transactionId);
}

