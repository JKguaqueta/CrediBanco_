package com.example.Repository;

import com.example.credibanco.model.Transaction;

public interface CardRepository<Card> {
    Card findByCardNumber(String cardNumber);

    Transaction findTransactionById(String transactionId);

    void saveCard(Card card);

    void saveTransaction(Transaction transaction);

    void deleteCard(String cardNumber);

    void deleteTransaction(String transactionId);
}
