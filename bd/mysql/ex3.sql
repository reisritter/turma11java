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

