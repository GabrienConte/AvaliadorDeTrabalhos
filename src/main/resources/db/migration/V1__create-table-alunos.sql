CREATE TABLE alunos (
                        id serial not null primary key ,
                        nome varchar(50) not null,
                        matricula varchar(8) not null,
                        email varchar(100) not null,
                        bairro varchar(100) not null,
                        cep varchar(9) not null,
                        complemento varchar(10) ,
                        numero varchar(20) ,
                        uf char(2) not null,
                        cidade varchar(100) not null
)