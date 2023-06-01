# -*- coding: utf-8 -*-

maior = -99999
menor = 99999
soma = 0

for num in range(1, 11):
    
    num = int(input("Informe o {0}º valor: ".format(num)))
    if num > 0 :
        if num > maior:
            maior = num
        if num < menor:
            menor = num
        soma = soma + num
    else:
        print("O valor informado é negativo. Por favor, informe um valor positivo.\n")
    
media = soma / 10
print(" ")    
print("O maior valor é {0}".format(maior))
print("O menor valor é {0}".format(menor))
print("A media entre os valores é {0}".format(media))
