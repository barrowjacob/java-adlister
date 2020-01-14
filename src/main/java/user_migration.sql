USE adlister_db;
CREATE TABLE IF NOT EXISTS users(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(25),
    email VARCHAR(50),
    password VARCHAR(25),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ads(
      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
      user_id INT UNSIGNED NOT NULL,
      title VARCHAR(50),
      description text,
      PRIMARY KEY (id),
      FOREIGN KEY (user_id) REFERENCES users (id)
);
