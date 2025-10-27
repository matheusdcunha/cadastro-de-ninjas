-- Cria a tabela de Missoes primeiro, pois Ninjas depende dela
CREATE TABLE missoes (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(255),
                         dificuldade VARCHAR(255)
);

-- Cria a tabela de Ninjas
CREATE TABLE ninjas (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        nome VARCHAR(255),
                        idade INT NOT NULL, -- 'int' primitivo não pode ser nulo
                        email VARCHAR(255) UNIQUE,
                        missao_id BIGINT,

    -- Cria a chave estrangeira referenciando a tabela missoes
                        FOREIGN KEY (missao_id) REFERENCES missoes(id)
);