create database db_empresa_eventos;

use db_empresa_eventos;

create table db_empresa_eventos(
id int primary key,
nome varchar(255),
local varchar(255),
preco_ingresso decimal (6,2)
);

insert into db_empresa_eventos values(1, 'rock in rio', 'rio de janeiro', 565.55);
insert into db_empresa_eventos values (2, 'lollapalooza', 'SP', 500.88);