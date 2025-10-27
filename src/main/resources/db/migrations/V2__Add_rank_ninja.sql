-- Migrations para adicionar a coluna de RANK na tabela de ninjas

ALTER TABLE NINJAS
ADD COLUMN rank VARCHAR(255);