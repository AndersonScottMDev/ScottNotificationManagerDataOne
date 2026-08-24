CREATE DATABASE IF NOT EXISTS store;

USE store;


CREATE TABLE `users` (
                         `id` bigint NOT NULL AUTO_INCREMENT,
                         `email` varchar(255) NOT NULL,
                         `name` varchar(255) NOT NULL,
                         `password` varchar(255) NOT NULL,
                         PRIMARY KEY (`id`)
)

-- store.addresses definition

CREATE TABLE `addresses` (
                             `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                             `street` varchar(255) NOT NULL,
                             `city` varchar(255) NOT NULL,
                             `zip` varchar(255) NOT NULL,
                             `user_id` bigint NOT NULL,
                             PRIMARY KEY (`id`),
                             KEY `addresses_users_fk_idx` (`user_id`),
                             CONSTRAINT `addresses_users_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
)


-- store.profiles definition

CREATE TABLE `profiles` (
                            `id` bigint NOT NULL,
                            `bio` text NOT NULL,
                            `phone_number` varchar(15) NOT NULL,
                            `date_of_birth` date NOT NULL,
                            `loyalty_points` int unsigned NOT NULL DEFAULT '0',
                            PRIMARY KEY (`id`),
                            CONSTRAINT `profiles_users_fk` FOREIGN KEY (`id`) REFERENCES `users` (`id`)
)

-- store.tags definition

CREATE TABLE `tags` (
                        `id` bigint NOT NULL AUTO_INCREMENT,
                        `name` varchar(255) NOT NULL,
                        PRIMARY KEY (`id`)
)


-- store.user_tags definition

CREATE TABLE `user_tags` (
                             `user_id` bigint NOT NULL,
                             `tag_id` bigint NOT NULL,
                             PRIMARY KEY (`tag_id`),
                             CONSTRAINT `user_tags_tags_fk` FOREIGN KEY (`tag_id`) REFERENCES `tags` (`id`) on delete cascade,
                             CONSTRAINT `user_tags_users_fk` FOREIGN KEY (`tag_id`) REFERENCES `users` (`id`) on delete cascade
)



