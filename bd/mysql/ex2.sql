create database if not exists db_RH2;
use db_RH2;
drop table if exists tb_cargo;
create table if not exists tb_cargo
(
	id int primary key auto_increment,
    nome varchar(255),
    vigencia bool
);
drop table if exists tb_funcionario;
create table if not exists tb_funcionario
(
	id int primary key auto_increment,
    nome varchar(255),
    sexo char(1),
    salario decimal(10,2),
    id_cargo int,
    foreign key(id_cargo) references tb_cargo(id)
);

INSERT INTO `tb_cargo` (`id`, `nome`, `vigencia`) VALUES (1, 'junior', 1);
INSERT INTO `tb_cargo` (`id`, `nome`, `vigencia`) VALUES (2, 'estagiario', 1);
INSERT INTO `tb_cargo` (`id`, `nome`, `vigencia`) VALUES (3, 'pleno', 1);
INSERT INTO `tb_cargo` (`id`, `nome`, `vigencia`) VALUES (4, 'senior', 1);

INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (1, 'Susanna', 'M', '43328.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (2, 'Carleton', 'F', '25008.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (3, 'Joanny', 'F', '35630.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (4, 'Thaddeus', 'M', '7720.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (5, 'Jamil', 'F', '49759.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (6, 'Madisen', 'M', '5040.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (7, 'Leonor', 'M', '34406.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (8, 'Moriah', 'M', '49489.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (9, 'Victor', 'M', '15012.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (10, 'Vernie', 'F', '44654.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (11, 'Leonel', 'M', '10743.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (12, 'Bo', 'F', '8612.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (13, 'Leif', 'M', '9199.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (14, 'Sophie', 'F', '48723.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (15, 'Monty', 'F', '36299.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (16, 'Domenico', 'F', '35141.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (17, 'Darrell', 'M', '22393.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (18, 'Lowell', 'F', '9848.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (19, 'Rubye', 'M', '8401.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (20, 'Cleora', 'F', '25170.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (21, 'Juana', 'M', '34085.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (22, 'Enos', 'M', '49022.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (23, 'Verla', 'F', '14750.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (24, 'Keon', 'M', '26655.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (25, 'Alison', 'F', '32099.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (26, 'Orin', 'M', '49831.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (27, 'Axel', 'M', '24962.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (28, 'Brook', 'M', '24342.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (29, 'Darrell', 'M', '19623.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (30, 'Lilliana', 'M', '14048.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (31, 'Vicente', 'M', '42699.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (32, 'Cleo', 'M', '27302.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (33, 'Alfreda', 'M', '5714.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (34, 'Tessie', 'F', '25359.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (35, 'Neva', 'M', '4714.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (36, 'Gillian', 'M', '37866.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (37, 'Edwin', 'M', '30283.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (38, 'Shaina', 'F', '26800.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (39, 'Lois', 'F', '42280.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (40, 'Allie', 'M', '7550.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (41, 'Retha', 'M', '6582.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (42, 'Karley', 'M', '6523.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (43, 'Judson', 'M', '24341.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (44, 'Karina', 'M', '22180.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (45, 'Celestino', 'F', '35678.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (46, 'Eddie', 'F', '14293.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (47, 'Dejuan', 'F', '1847.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (48, 'Blanche', 'F', '30520.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (49, 'Guido', 'M', '13515.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (50, 'Julie', 'F', '25699.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (51, 'Vincenzo', 'M', '49547.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (52, 'Isabella', 'F', '14543.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (53, 'Angelita', 'M', '12824.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (54, 'Misael', 'M', '46547.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (55, 'Hellen', 'F', '13128.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (56, 'Graham', 'F', '6866.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (57, 'Trent', 'M', '44527.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (58, 'Alysa', 'M', '46764.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (59, 'Spencer', 'M', '43464.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (60, 'Danyka', 'F', '29640.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (61, 'Malika', 'M', '1230.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (62, 'Kellie', 'M', '21636.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (63, 'Osborne', 'M', '2252.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (64, 'Monty', 'M', '7828.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (65, 'Kallie', 'M', '4804.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (66, 'Willa', 'F', '17883.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (67, 'Abdiel', 'F', '24396.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (68, 'Shanel', 'M', '40036.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (69, 'Zelma', 'M', '39263.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (70, 'Alysha', 'F', '42302.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (71, 'Angelina', 'M', '33223.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (72, 'Alberto', 'M', '90.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (73, 'Rocky', 'M', '19658.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (74, 'Shea', 'M', '43217.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (75, 'Macey', 'F', '30452.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (76, 'Margret', 'F', '46147.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (77, 'Alice', 'F', '7758.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (78, 'Rudolph', 'F', '29001.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (79, 'Orval', 'M', '8440.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (80, 'Loren', 'M', '46789.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (81, 'Brenna', 'F', '39634.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (82, 'Rhea', 'F', '14529.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (83, 'Dejuan', 'M', '44892.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (84, 'Dusty', 'F', '40396.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (85, 'Wilbert', 'M', '3175.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (86, 'Hans', 'M', '10853.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (87, 'Marcelle', 'M', '9835.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (88, 'Conner', 'F', '18148.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (89, 'Aimee', 'F', '11705.00', 4);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (90, 'Theresia', 'M', '26198.00', 2);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (91, 'Mina', 'F', '11206.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (92, 'Estevan', 'M', '8647.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (93, 'Raquel', 'F', '9597.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (94, 'Jules', 'M', '25641.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (95, 'Uriah', 'M', '42807.00', 3);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (96, 'Bill', 'F', '23392.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (97, 'Lauretta', 'F', '1174.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (98, 'Kory', 'M', '45182.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (99, 'Pearline', 'F', '48452.00', 1);
INSERT INTO `tb_funcionario` (`id`, `nome`, `sexo`, `salario`, `id_cargo`) VALUES (100, 'Cortney', 'M', '40097.00', 3);

select * from tb_funcionario where salario > 2000;
select * from tb_funcionario where salario between 1000 and 2000;
select * from tb_funcionario where nome like '%c%';