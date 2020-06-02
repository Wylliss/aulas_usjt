use previsaodotempo;

insert into usuario(id, login, senha) values (1, 'wyllis', 'admin');

insert into cidade (id, cidade, latitude, longitude) values (1, 'Carapicuiba', 1111111, 222222);
insert into cidade (id, cidade, latitude, longitude) values (2, 'Barueri', 222222, 333333);
insert into cidade (id, cidade, latitude, longitude) values (3, 'Osasco', 333333, 444444);

insert into diadasemana(diadasemana) values ('Segunda-Feira');
insert into diadasemana(diadasemana) values ('Terça-Feira');
insert into diadasemana(diadasemana) values ('Quarta-Feira');
insert into diadasemana(diadasemana) values ('Quinta-Feira');
insert into diadasemana(diadasemana) values ('Sexta-Feira');
insert into diadasemana(diadasemana) values ('Sábado');
insert into diadasemana(diadasemana) values ('Domingo');

INSERT INTO `previsaodotempo`.`previsao` (`id`, `data`, `descricao`, `tempmax`, `tempmin`, `umidade`, `cidade_id`, `diadasemana`) VALUES ('1', '2020/10/25', 'sol e nuvens', '20', '15', '30', '1', '2');
INSERT INTO `previsaodotempo`.`previsao` (`id`, `data`, `descricao`, `tempmax`, `tempmin`, `umidade`, `cidade_id`, `diadasemana`) VALUES ('2', '2020/10/26', 'sol e nuvens', '25', '18', '37', '2', '3');
INSERT INTO `previsaodotempo`.`previsao` (`id`, `data`, `descricao`, `tempmax`, `tempmin`, `umidade`, `cidade_id`, `diadasemana`) VALUES ('3', '2020/10/26', 'Bastante chuva', '30', '20', '37', '3', '4');