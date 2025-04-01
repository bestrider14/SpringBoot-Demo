CREATE TABLE wishlist
(
    product_id BIGINT UNSIGNED NOT NULL,
    user_id    BIGINT UNSIGNED NOT NULL,
    CONSTRAINT pk_wishlist PRIMARY KEY (product_id, user_id),
    CONSTRAINT fk_wishlist_on_product FOREIGN KEY (product_id) REFERENCES products (id),
    CONSTRAINT fk_wishlist_on_user FOREIGN KEY (user_id) REFERENCES users (id)
);
