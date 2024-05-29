insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('JaozinRestaurante', 1.10, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('PedrinComidas', 1.00, 2);

insert into estado (id, nome) values (1, 'Paraná');
insert into estado (id, nome) values (2, 'São Paulo');
insert into estado (id, nome) values (3, 'Rio de Janeiro');

insert into cidade (nome, estado_id) values ("Londrina", 1);
insert into cidade (nome, estado_id) values ("São Paulo", 2);
insert into cidade (nome, estado_id) values ("Rio de Janeiro", 3);

insert into forma_pagamento (descricao) values ("Cartão de credito");
insert into forma_pagamento (descricao) values ("Cartão de debito");
insert into forma_pagamento (descricao) values ("Dinheiro");
insert into forma_pagamento (descricao) values ("Pix");

insert into permissao (nome, descricao) values ("Usuario", "Acesso apenas em funcionalidades simples!");
insert into permissao (nome, descricao) values ("Administrador", "Acesso a varias funcionalidades, incluindo adicionar e remover usuarios!");