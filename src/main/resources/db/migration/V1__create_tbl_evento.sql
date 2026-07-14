CREATE TABLE evento (
                        id BIGINT PRIMARY KEY,
                        nome VARCHAR(255) NOT NULL,
                        descricao TEXT,
                        data_inicio TIMESTAMP NOT NULL,
                        data_fim TIMESTAMP NOT NULL,
                        identificador VARCHAR(20) NOT NULL UNIQUE,
                        local VARCHAR(255) NOT NULL,
                        capacidade INT NOT NULL,
                        organizador VARCHAR(100) NOT NULL,
                        tipo_evento VARCHAR(20) NOT NULL,
                        criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);