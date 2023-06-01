# -*- coding: utf-8 -*-
print("Calculo salario e horas extras.\n")
codigo = int(input("Informe o codigo do trabalhador: "))
horas_trabalhadas = float(input("Funcionario {0}, informe quantas horas trabalhou: ".format(codigo)))

excedente = 0
salario = horas_trabalhadas * 10

if horas_trabalhadas > 50:
    excedente = horas_trabalhadas - 50
    horas_trabalhadas = horas_trabalhadas - excedente
    salario1 = 50 * 10
    horas_extras = excedente * 20
    salario_total = salario1 + horas_extras
    print("Seu salario por 50horas trabalhadas é R${0:.2f}, excedendo {1}h. Horas extras R${2:.2f}.".format(salario1, excedente, horas_extras))
    print("Salario total com extra R${0:.2f}".format(salario_total))
else:
    print("Você trabalhou {0}h e não teve horas extras. Seu salario é de R${1:.2f}".format(horas_trabalhadas, salario))