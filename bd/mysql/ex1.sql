drop database if exists ex1;
create database if not exists ex1;
use ex1;
create table if not exists funcionario
(
	id int primary key auto_increment,
    nome varchar(255),
    sexo char(1),
    nascimento date,
    email varchar(255),
    salario decimal(8,2)
);
insert into funcionario (nome,sexo,nascimento,email,salario)values
('Gabriel','M','1995-09-12','gabriel@hotmail.com',10000)
,('Jorge','M','1992-09-12','jorge@hotmail.com',5000)
,('Amanda','F','1993-09-02','amanda@hotmail.com',1500)
,('Carol','F','1996-02-12','carol@hotmail.com',12000)
,('Giovanna','F','1995-09-19','giovanna@hotmail.com',15000);

select * from funcionario where salario >= 2000;
select * from funcionario where salario <= 2000;

update funcionario set salario=30000 where id=1;

alter table funcionario add column vigencia bool default true;

