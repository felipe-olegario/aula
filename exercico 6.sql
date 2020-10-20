create database financeiro;
use financeiro;
create table pessoa(
idPessoa int primary key auto_increment,
nome varchar(45),
dataNascimento date,
proficao varchar(45)
)auto_increment=1;

create table gastos(
idGasto int primary key	auto_increment,
dataCompra date,
valor int,
descricao varchar(45),
fkPessoa int,
foreign key (fkPessoa) references pessoa(idPessoa)
)auto_increment=100;

insert into pessoa values
(null,'felipe','2000-05-09', 'desenvolvedor'),
(null,'matheus','1993-01-30','auxiliar administrativo'),
(null,'jorge', '1978-05-29','advogado');

select*from pessoa;

insert into gastos values
(null, '2020-09-29', '500', 'concertos da moto', 1),
(null,'2020-05-30','299.99','compra de um tenis', 2),
(null,'2020-07-07','99.99','compra do presente do felipe',3);
select*from gastos;

select proficao from pessoa;

select valor from gastos;

select*from pessoa,gastos where idPessoa=fkPessoa;

select pessoa.*,valor from pessoa, gastos where idPessoa=fkPessoa;

update pessoa set nome= 'felipe olegario' where idPessoa = 1;

delete nome from pessoa where idPessoa = 1;
