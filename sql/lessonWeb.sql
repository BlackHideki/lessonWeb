DROP DATABASE IF EXISTS lesson_web;

CREATE DATABASE lesson_web;

use lesson_web;

CREATE TABLE chat(
id int NOT NULL AUTO_INCREMENT,
name VARCHAR(20) DEFAULT "nameLess",
msg_color VARCHAR(10) NOT NULL,
msg TEXT NOT NULL,
PRIMARY KEY(id)
);
