INSERT INTO USUARIO(nome) VALUES ('Anderson');
INSERT INTO USUARIO(nome) VALUES ('Ana');

INSERT INTO CONTA(nome, descricao, saldo, logotipo, status ) VALUES ('Itau', 'Conta principal', '1900.50', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmOGFwxrl6X5ESHEnfcv6eefm6lbQcypC_6V0qNYVrIWcLrLf78WvCRQAeKpFJprs5tC0&usqp=CAU', true);
INSERT INTO CONTA(nome, descricao, saldo, logotipo, status ) VALUES ('Nubank', 'Conta com rendimento 100% do CDI', '3421.12', 'https://nubank.com.br/_next/static/images/cbf49577e11c5507dbd0019319ae8a66-kit-logo.png', true);

INSERT INTO LANCAMENTO(descricao, valor, data_criacao, tipo_movimento, conta_id, usuario_id) VALUES ('Computador novo', 5500.65, '2022-04-08', 'SAIDA', 1, 1);
INSERT INTO LANCAMENTO(descricao, valor, data_criacao, tipo_movimento, conta_id, usuario_id) VALUES ('Compras no mercado', 55.50, '2022-03-08', 'SAIDA', 1, 2);
INSERT INTO LANCAMENTO(descricao, valor, data_criacao, tipo_movimento, conta_id, usuario_id) VALUES ('Pagamento', 1000.65, '2022-04-07', 'ENTRADA', 1, 1);
INSERT INTO LANCAMENTO(descricao, valor, data_criacao, tipo_movimento, conta_id, usuario_id) VALUES ('Investimento', 500, '2022-02-08', 'TRANSFERENCIA', 1, 1);
INSERT INTO LANCAMENTO(descricao, valor, data_criacao, tipo_movimento, conta_id, usuario_id) VALUES ('Gasolina', 220.22, '2022-01-09', 'SAIDA', 1, 1);
INSERT INTO LANCAMENTO(descricao, valor, data_criacao, tipo_movimento, conta_id, usuario_id) VALUES ('Teclado novo', 330.35, '2022-04-10', 'SAIDA', 1, 2);
INSERT INTO LANCAMENTO(descricao, valor, data_criacao, tipo_movimento, conta_id, usuario_id) VALUES ('Gás', 350, '2022-04-08', 'SAIDA', 1, 1);
INSERT INTO LANCAMENTO(descricao, valor, data_criacao, tipo_movimento, conta_id, usuario_id) VALUES ('Ração para cachorros', 175, '2022-04-08', 'SAIDA', 1, 2);
