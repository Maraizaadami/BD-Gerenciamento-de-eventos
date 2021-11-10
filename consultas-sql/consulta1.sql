--Query 1: Selecione os Ids e Preços de Recibos e Notas emitidos por Contas
--geradas pela Loja "Lojinha DASI USP - Passem lá na salinha depois da aula

Select Recibo.Id, Recibo.Preco_total
from Recibo, Conta, Loja
where Recibo.Numero_do_boleto = Conta.Numero_do_boleto
and Conta.Nome_loja = Loja.Nome_Loja
and Loja.Tema like "DASI"
union
Select Nota_Fiscal.Id, Nota_Fiscal.Preco_total
from Nota_Fiscal, Conta, Loja
where Nota_Fiscal.Numero_do_boleto = Conta.Numero_do_boleto
and Conta.Nome_loja = Loja.Nome_Loja
and Loja.Tema like "DASI"
