USE adlister_db;
DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(25),
    email VARCHAR(50),
    password VARCHAR(25),
    PRIMARY KEY (id)
);