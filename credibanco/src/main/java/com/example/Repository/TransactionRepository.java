package com.example.Repository;

import com.example.credibanco.model.Transaction;

public interface TransactionRepository {
    Transaction findById(String transactionId);

    void save(Transaction transaction);

    void deleteById(String transactionId);

    // Otros métodos relacionados con el repositorio de transacciones
}

