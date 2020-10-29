drop database if exists db_RH2;
create database db_RH2;
use db_RH2;

create table tb_cargo 
(
	id int primary key auto_increment,
    nome varchar(255)
);

create table tb_funcionario
(
	id int primary key auto_increment,
    nome varchar(255),
    salario decimal(10,2),
    id_cargo int,
    foreign key(id_cargo)references tb_cargo(id)
);

insert into tb_cargo values(default,'Analista');
insert into tb_cargo values(default,'Programador');
insert into tb_cargo values(default,'Consultor');

insert into tb_funcionario values(default,'Gabriel',1500,1);
insert into tb_funcionario values(default,'Gabriela',2500,2);
insert into tb_funcionario values(default,'Jorge',2000,3);
insert into tb_funcionario values(default,'Mario',10500,1);
insert into tb_funcionario values(default,'Luigi',2000,2);
insert into tb_funcionario values(default,'Andrea',5000,3);
insert into tb_funcionario values(default,'Rafa',3700,null);

select * from tb_funcionario where salario >= 2000;
select * from tb_funcionario where salario between 1000 and 2000;
select * from tb_funcionario where nome like '%c%';

