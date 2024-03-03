-- Criar a tabela Animal se ela não existir
CREATE TABLE IF NOT EXISTS Animal (
                                      id INT AUTO_INCREMENT PRIMARY KEY,
                                      nome VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    idade INT,
    raca VARCHAR(255),
    adotado VARCHAR(255)
    );

-- Inserir dados
INSERT INTO Animal (nome, tipo, idade, raca, adotado) VALUES
                                                          ('Frajola', 'Gato', 3, 'Siames', false),
                                                          ('Tom', 'Gato', 2, 'Vira-lata', true),
                                                          ('Garfield', 'Gato', 5, 'Persa', true),
                                                          ('Rex', 'Cachorro', 2, 'Pastor Alemão', false),
                                                          ('Buddy', 'Cachorro', 4, 'Golden Retriever', false);
