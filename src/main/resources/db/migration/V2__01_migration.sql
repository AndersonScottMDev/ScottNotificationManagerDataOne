-- store.categories definition
USE store;

-- store.categories definition

CREATE TABLE `categories` (
                              `id` tinyint NOT NULL AUTO_INCREMENT,
                              `name` varchar(255) NOT NULL,
                              PRIMARY KEY (`id`)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- store.products definition



CREATE TABLE `products` (
                            `id` bigint NOT NULL AUTO_INCREMENT,
                            `category_id` tinyint NOT NULL,
                            `name` varchar(255) NOT NULL,
                            `price` DECIMAL(10, 2) NOT NULL,
                            PRIMARY KEY (`id`),
                            CONSTRAINT `fk_category` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



