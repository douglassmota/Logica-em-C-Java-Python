# -*- coding: utf-8 -*-
print("Tabuada de 1 a 10\n")
num1 = int(input("Informe numero de 1 a 10 para calculo da tabuada: "))

while num1 > 10 or num1 < 1:
    print("Numero deve estar entre 1 e 10.\n")
    num1 = int(input("Informe numero de 1 a 10 para calculo da tabuada: "))
print("Tabuada do numero {0}.".format(num1))

for n in range(1,11):
    result = num1 * n
    print("{0} X {1} = {2}".format(num1, n, result))