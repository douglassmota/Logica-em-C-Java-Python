# -*- coding: utf-8 -*-
print("Calculo de estoque médio de peças.\n")
qnt_minima = int(input("Informe a quantidade minima de peças: "))
qnt_max = int(input("Informe a quantidade maxima de peças: "))

soma = qnt_minima + qnt_max
estoque_medio = soma / 2

print("Temos um estoque medio de {0} peças.".format(estoque_medio))