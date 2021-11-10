-- Selecione o CPF de todos os Staff de eventos que 
-- registraram mais de uma ocorrência e identifique o evento.

SELECT s.cpf, e.id, e.nome, COUNT(*) FROM Staff s
INNER JOIN Ocorrencia o ON s.id=o.id_staff
INNER JOIN Evento e ON e.id=o.id_evento
GROUP BY s.cpf, e.id
HAVING COUNT(*) > 1;