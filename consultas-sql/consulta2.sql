--Query 2: Selecione o nome completo e o email de todos os participantes que
--participaram de palestras que ocorreram em "Tambaú" e foram palestradas por "Palestrante Coach Quântico".

Select Participante.Nome_Completo, Participante.Email
from Participante, Palestras, Palestrante, Participa_De, Palestra_Em,
Atividade, Ocorre_Em
where Palestrante.CPF = Participa_De.CPF
and Palestra_Em.id = Palestras.id
and Palestras.id = Atividade.id
and Atividade.id = Ocorre_Em.O_A_id
and Ocorre_Em.Endereco like "Tambaú"
and Participante.CPF = Palestrante.CPF
and Participante.Nome_Completo like "Palestrante Coach Quântico"
