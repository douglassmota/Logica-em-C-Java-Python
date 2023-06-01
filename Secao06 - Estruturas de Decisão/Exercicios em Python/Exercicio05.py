# -*- coding: utf-8 -*-
print("Calculo multa por excesso.\n")
peso = float(input("Informe quantos Kg de peixe você pescou? "))

excesso = 0
multa = 0

if peso > 50:
    excesso = peso - 50
    multa = excesso * 4
    print("Temos {0} kg de peixe, excedendo {1} kg. A multa sera de R${2:.2f}".format(peso, excesso, multa))
else:
    print("Você esta com {0}kg de peixe. Não excedeu. Não há multa.".format(peso))
    