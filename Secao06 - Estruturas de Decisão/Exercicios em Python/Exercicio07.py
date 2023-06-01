# -*- coding: utf-8 -*-
print("Numeros ao Quadrado.\n")
num1 = int(input("Informe o 1º numero: "))
num2 = int(input("Informe o 2º numero: "))
num3 = int(input("Informe o 3º numero: "))
num4 = int(input("Informe o 4º numero: "))
print(" ")

q1 = num1 * num1
q2 = num2 * num2
q3 = num3 * num3
q4 = num4 * num4

if q3 > 1000:
    print("Quadrado apenas do Terceiro valor = {0}.".format(q3))
else:
    print("Quadrado de todos os numeros:")
    print("{0} = {1}".format(num1, q1))
    print("{0} = {1}".format(num2, q2))
    print("{0} = {1}".format(num3, q3))
    print("{0} = {1}".format(num4, q4))


