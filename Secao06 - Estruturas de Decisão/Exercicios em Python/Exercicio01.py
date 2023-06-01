# -*- coding: utf-8 -*-
print("Imprimir apenas valores maiores que 100.")
num1 = int(input("Informe um valor para analise: "))

if num1 > 100 :
    print("{0} é maior que 100.".format(num1))
else:
    print("Erro! {0} é menor que 100.".format(num1))