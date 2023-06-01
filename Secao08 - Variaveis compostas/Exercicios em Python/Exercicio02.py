# -*- coding: utf-8 -*-
vetor1 = []
vetor2 = []
soma = []

for i in range(1,11):
    valor1 = int(input("Digite um valor para o 1º vetor: "))
    valor2 = int(input("Digite um valor para o 2º vetor: "))
    print(" ")
    vetor1.append(valor1)
    vetor2.append(valor2)
    soma.append(valor1 + valor2)

print("Soma do primeiro valor com segundo:")

for i in soma:    
    print(i)