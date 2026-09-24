-- store.categories definition
USE store;

-- store.wishlist definition

CREATE TABLE store.wishlist (
                                user_id BIGINT NOT NULL,
                                product_id BIGINT NOT NULL,
                                CONSTRAINT wishlist_pk PRIMARY KEY (user_id,product_id),
                                CONSTRAINT wishlist_products_fk FOREIGN KEY (product_id) REFERENCES store.products(id),
                                CONSTRAINT wishlist_users_fk FOREIGN KEY (user_id) REFERENCES store.users(id)
);
