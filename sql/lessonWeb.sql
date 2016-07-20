DROP DATABASE IF EXISTS lesson_web;

CREATE DATABASE lesson_web;

use lesson_web;

CREATE TABLE chat_room(
id int NOT NULL AUTO_INCREMENT,
name VARCHAR(20) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE post(
id int NOT NULL,
msg_time VARCHAR(20) NOT NULL,
name VARCHAR(20) DEFAULT "nameLess" NOT NULL,
msg_color VARCHAR(10) NOT NULL,
msg TEXT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(id) REFERENCES chat_room(id) ON DELETE CASCADE
);
