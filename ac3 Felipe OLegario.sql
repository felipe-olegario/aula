
create database ac3_felipe;
    
use ac3_felipe;
    
create table campeonato(
idCampeonato int primary key auto_increment,
nomeCampeonato varchar(30),
descricao varchar(70)
) auto_increment = 1000;
alter table campeonato modify nomeCampeonato varchar(70);
alter table campeonato modify descricao varchar(150);

insert into campeonato values
(null, 'Campeonato Paulista de Basquete', 'Campeonato 5x5, com premiação em dinheiro. Lembrando que são permitidos apenas times de São Paulo'),
(null, 'Campeonato Brasileiro de Basquete', 'Campeonato 5x5, com premiação em dinheiro, onde todos os times do Brasil são permitidos');

select*from campeonato;


create table esportistas(
idEsportista int primary key auto_increment,
nomeEsportista varchar(30),
data_nascimento date,
altura decimal(3,2),
fktime int,
foreign key(fktime) references equipe(idEquipe)
);

alter table esportistas rename column fkTime to fkEquipe;

insert into esportistas values
(null, 'felipe', '200-07-07', '1.91', '100'),
(null, 'Matheus','1998-08-12', '2.00','100'),
(null, 'Gabriel', '1995-08-23', '2.10', '100'),
(null, 'Vinicius', '1993-12-04', '2.15', '101'),
(null, 'Oliveira', '2001-11-01', '1.85', '101'),
(null, 'Alencar', '1999-02-21', '1.90', '101'),
(null, 'paulo', '1996-06-16', '1.98', '102'),
(null, 'Pablo', '2000-03-04', '1.95', '103'),
(null, 'Filipe', '2000-04-04', '1.97', '103'),
(null, 'Regis', '1998-05-26', '2.03', '103'),
(null, 'Leoncion', '1997-07-25', '2.20', '104'),
(null, 'Lion', '1990-08-19', '1.83', '104');

select*from esportistas;


create table equipe(
idEquipe int primary key auto_increment,
nomeTreinador varchar(30),
nomeEquipe varchar(30),
local_treinamento varchar(30)
) auto_increment=100;

insert into equipe values
(null, 'Jorge', 'Paulistano', 'Centro'),
(null, 'Paulão', 'Pinheiros', 'Pinheiros'),
(null, 'Silva', 'São Paulo', 'Barra Funda'),
(null, 'Marcio', 'Basquete Cearense', 'Fortaleza'),
(null, 'Carlos', 'Minas Storm', 'Belo Horizonte');

select*from equipe;

create table dados_campeonato(
fkEquipe int,
foreign key(fkEquipe) references equipe(idEquipe),
fkCampeonato int,
foreign key(fkCampeonato) references campeonato(idCampeonato),
vitorias int,
derrotas int
);

insert into dados_campeonato values
(100, 1000, 20, 5),
(101, 1000, 18, 7),
(102, 1000, 23, 2),
(103, 1001, 16, 9),
(104, 1001, 19, 6);

select*from dados_campeonato;

-- Exibir os dados das tabelas, de forma correspondente;

select*from equipe inner join esportistas on idEquipe = fkEquipe;

select*from campeonato inner join dados_campeonato on idCampeonato = fkCampeonato;

select*from equipe inner join dados_campeonato on idEquipe = fkEquipe;

-- Exibir os dados das tabelas, de forma correspondente, de um determinado campo;

select*from equipe inner join esportistas on idEquipe = fkEquipe where idEquipe = 101;

select*from campeonato inner join dados_campeonato on idCampeonato = fkCampeonato where idCampeonato = 1000;

select*from equipe inner join dados_campeonato on idEquipe = fkEquipe where idEquipe = 100;

-- Exibir os dados da tabela associativa, utilizando o atributo numérico com pelo menos 1 função aprendida (SUM, AVG, MIN, MAX) e agrupando esses dados por um determinado campo (GROUP BY).

select max(vitorias) from dados_campeonato group by fkCampeonato;