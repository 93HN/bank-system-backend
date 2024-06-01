-- V1__criar_tabela_user_db.sql

DO $$
BEGIN
    IF NOT EXISTS (SELECT FROM information_schema.tables WHERE table_name = 'user_db') THEN
        CREATE TABLE user_db (
            id SERIAL PRIMARY KEY,
            name VARCHAR(100) NOT NULL,
            password VARCHAR(100) NOT NULL,
            email VARCHAR(100) NOT NULL UNIQUE,
            address VARCHAR(255),
            phone_number VARCHAR(20)
        );
    END IF;
END $$;
