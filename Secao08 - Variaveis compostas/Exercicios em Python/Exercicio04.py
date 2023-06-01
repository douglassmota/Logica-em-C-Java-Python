# -*- coding: utf-8 -*-
vetor = []
soma = 0

for i in range(1,21):
    num1 = int(input("Informe o {0}º valor: ".format(i)))
    vetor.append(num1)
    soma = soma + num1
print(" ")    
print("A soma de todos os elementos é = {0}".format(soma))