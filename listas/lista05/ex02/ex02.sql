create database db_floricultura;

use db_floricultura;

create table db_floricultura(
id int primary key,
especie varchar(255),
preco decimal (6,2)
);

insert into db_floricultura values(1, 'tulipas',  56.55);