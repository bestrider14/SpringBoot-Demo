CREATE TABLE users
(
    id          BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    email       VARCHAR(255) NOT NULL,
    password    VARCHAR(255) NOT NULL
);

CREATE TABLE addresses
(
    id          BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    street      VARCHAR(255) NOT NULL,
    city        VARCHAR(255) NOT NULL,
    zip         VARCHAR(255) NOT NULL,
    user_id     BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id)
);