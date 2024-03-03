-- Criar a tabela Animal se ela não existir
CREATE TABLE IF NOT EXISTS Animal (
                                      id INT AUTO_INCREMENT PRIMARY KEY,
                                      nome VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    idade INT,
    raca VARCHAR(255),
    adotado BOOLEAN
    );

-- Inserir dados na tabela Animal
INSERT INTO Animal (nome, tipo, idade, raca, adotado) VALUES
                                                          ('Frajola', 'Gato', 3, 'Siames', false),
                                                          ('Tom', 'Gato', 2, 'Vira-lata', false),
                                                          ('Garfield', 'Gato', 5, 'Persa', false),
                                                          ('Rex', 'Cachorro', 2, 'Pastor Alemão', false),
                                                          ('Buddy', 'Cachorro', 4, 'Golden Retriever', false);

-- Criar a tabela Pessoa se ela não existir
CREATE TABLE IF NOT EXISTS Pessoa (
                                      id INT AUTO_INCREMENT PRIMARY KEY,
                                      nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    email VARCHAR(255)
    );

-- Inserir dados na tabela Pessoa
INSERT INTO Pessoa (nome, cpf, endereco, email) VALUES
                                                    ('Fulano', '113.456.789-01', 'Rua A, 121', 'fulano@email.com'),
                                                    ('Ciclano', '123.456.789-01', 'Rua B, 122', 'ciclano@email.com'),
                                                    ('Beltrano', '133.456.789-01', 'Rua C, 123', 'beltrano@email.com'),
                                                    ('Fulanos4', '143.456.789-01', 'Rua D, 124', 'fulano4@email.com');
