# -*- coding: utf-8 -*-
vetor = []
maior_50 = 0

for i in range(1,11):
    num = int(input("Informe o {0}º valor: ".format(i)))
    vetor.append(num)
    if num > 50:
        print("Numero {0} maior que 50 e esta na posição {1}\n".format(num,i))
        maior_50 = 1
if maior_50 == 0:
    print("Não existem valores maiores que 50!")