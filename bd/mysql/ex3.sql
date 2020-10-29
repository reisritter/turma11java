drop database if exists db_cidade_das_carnes;
create database if not exists db_cidade_das_carnes;
use db_cidade_das_carnes;
create table if not exists tb_categoria
(
	id int primary key auto_increment,
    nome varchar(255)
);
create table if not exists tb_produto 
(
	id int primary key auto_increment,
    nome varchar(255),
    valor decimal(10,2),
    id_categoria int,
    foreign key(id_categoria) references tb_categoria(id)
);

insert into tb_categoria values (default,'Carne');
insert into tb_categoria values (default,'Frango');

insert into tb_produto values(default,'Picanha',20.5,1);
insert into tb_produto values(default,'Peito de frango',15.7,2);
insert into tb_produto values(default,'Baguiete',200.5,null);

select * from tb_produto where valor >= 50;
select * from tb_produto where valor between 3 and 60;
select * from tb_produto where nome like '%co%';
select * from tb_produto p left join tb_categoria c 
	on (p.id_categoria=c.id);
select * from tb_produto p inner join tb_categoria c 
	on (p.id_categoria=c.id and c.id=1);

#----------------------------------------------------------

drop database if exists db_construindo_a_nossa_vida;
create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria
(
	id int primary key auto_increment,
    nome varchar(255)
);

create table tb_produto 
(
	id int primary key auto_increment,
    nome varchar(255),
    preco decimal(10,2),
    vigencia bool,
    id_categoria int,
    foreign key(id_categoria) references tb_categoria(id)
);

insert into tb_categoria values
(default,'catg1'),
(default,'catg2'),
(default,'catg3'),
(default,'catg4'),
(default,'catg5');

insert into tb_produto values
(default,'PROD1',10,true,1),
(default,'PROD2',20,true,2),
(default,'PROD3',30,true,3),
(default,'PROD4',100,true,4),
(default,'PROD5',200,true,5),
(default,'PROD6',300,true,1),
(default,'PROD7',400,true,2),
(default,'PROD8',500,true,3);

select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like '%CL%';
select * from tb_produto p inner join tb_categoria c on p.id_categoria=c.id;
select * from tb_produto p inner join tb_categoria c on p.id_categoria=c.id and c.id = 1;

#-------------------------------------------------------------------

drop database if exists db_cursoDaMinhaVida;
create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria
(
	id int primary key auto_increment,
    nome varchar(255)
);

create table tb_curso 
(
	id int primary key auto_increment,
    nome varchar(255),
    preco decimal(10,2),
    vagas int,
    id_categoria int,
    foreign key(id_categoria) references tb_categoria(id)
);

insert into tb_categoria values
(default,'catg1'),
(default,'catg2'),
(default,'catg3'),
(default,'catg4'),
(default,'catg5');

insert into tb_curso values
(default,'Curso1',1500,20,1),
(default,'Curso2',2000,20,2),
(default,'Curso3',1000,30,3),
(default,'Curso4',100,40,4),
(default,'Curso5',200,20,5),
(default,'Curso6',300,30,1),
(default,'Curso7',400,40,2),
(default,'Curso8',500,10,3);

select * from tb_curso where preco > 50;
select * from tb_curso where preco between 3 and 60;
select * from tb_curso where nome like '%CL%';
select * from tb_curso p inner join tb_categoria c on p.id_categoria=c.id;
select * from tb_curso p inner join tb_categoria c on p.id_categoria=c.id and c.id = 1;
