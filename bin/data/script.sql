create database bdFatec

use bdFatec

create table tbUsuarios(
id int not null auto_increment primary key,
nome varchar(200) not null,
email varchar(200) not null,
tipo int not null
)