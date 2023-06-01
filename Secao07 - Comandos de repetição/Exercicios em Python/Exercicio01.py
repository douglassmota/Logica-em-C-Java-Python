# -*- coding: utf-8 -*-
num1 = int(input("Informe um valor: "))

maior = 0

while num1 != 0:
    if num1 > maior:
        maior = num1
    num1 = int(input("Informe um valor: "))

print("O maior valor é {0}".format(maior))