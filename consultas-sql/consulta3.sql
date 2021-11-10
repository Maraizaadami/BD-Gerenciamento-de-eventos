--Query 3: Selecione o nome e o CPF das empresas que locaram ao menos 1
--carro para transportar a caravana "Reprogramadores no Intercomp" ou o 
--de empresas que venderam pelo menos uma passagem que
--tinha como origem "Santa Rita".

Select Empresa.CNPJ 
from Empresa, Carro, Caravana, Transporta
where Empresa.CNPJ = Carro.CNPJ
and Carro.Placa = Transporta.Placa 
and Transporta.Nome_Caravana like "Reprogramadores no
Intercomp"
union
Select Empresa.CNPJ
from Empresa, Passagem
where Empresa.CNPJ = Passagem.CNPJ
and Passagem.Origem like "Santa Rita"
