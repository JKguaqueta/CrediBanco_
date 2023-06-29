--Insertar una tarjeta (Card) en la tabla Cards:
INSERT INTO Cards (card_number, owner_name, expiration_date, balance, is_active)
VALUES ('1234567890123456', 'John Doe', '2025-06-30', 100.00, 1);

--Insertar una transacción (Transaction) asociada a una tarjeta en la tabla Transactions:
INSERT INTO Transactions (card_id, amount)
VALUES (1, 50.00);

--Obtener todas las tarjetas (Cards) de la tabla Cards:
INSERT INTO Transactions (card_id, amount) VALUES (1, 50.00);

--Obtener todas las tarjetas (Cards) de la tabla Cards:
SELECT * FROM Cards;

--Obtener todas las transacciones (Transactions) de la tabla Transactions:
SELECT * FROM Transactions;

--Actualizar el saldo (balance) de una tarjeta específica en la tabla Cards:
UPDATE Cards SET balance = 200.00 WHERE card_id = 1;

--Obtener el saldo (balance) de una tarjeta específica en la tabla Cards:
SELECT balance FROM Cards WHERE card_id = 1;



