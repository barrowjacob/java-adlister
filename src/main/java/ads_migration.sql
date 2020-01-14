USE adlister_db;
DROP TABLE IF EXISTS ads;
CREATE TABLE IF NOT EXISTS ads(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(50),
    description text,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
 );
