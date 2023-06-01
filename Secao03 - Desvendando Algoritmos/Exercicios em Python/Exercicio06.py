# -*- coding: utf-8 -*-
print("Calculo Salario.\n")
horas_trabalhadas = int(input("Quantas horas você trabalha por mes? "))
valor_hora = float(input("Quanto voce ganha por hora R$? "))

salario = horas_trabalhadas * valor_hora

print("Você trabalhou {0} horas e vai receber R${1}".format(horas_trabalhadas, salario))