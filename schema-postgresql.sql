CREATE TABLE IF NOT EXISTS cliente (
     id serial PRIMARY KEY,
     nome  varchar(50),
     cpf varchar(11)
);

CREATE TABLE IF NOT EXISTS moeda (
     id serial PRIMARY KEY,
     id_cliente int,
     nome  varchar(50),
     preco_atual real,
     maior_preco real,
     menor_preco real,
     preco_medio real,
     FOREIGN KEY (id_cliente) REFERENCES cliente (id),
);
