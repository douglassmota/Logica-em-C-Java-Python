# -*- coding: utf-8 -*-
print("Par ou Impar.\n")
num1 = int(input("Informe um numero para analise: "))

if num1 % 2 == 0:
    par = num1
    print("Numero {0} é Par.".format(par))
else:
    impar = num1
    print("Numero {0} é Impar.".format(impar))