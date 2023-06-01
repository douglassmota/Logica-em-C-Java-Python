# -*- coding: utf-8 -*-
print("Calculo de peso ideal.\n")
altura = float(input("Informe sua altura: "))
sexo = input("Informe o sexo [M] Masculino ou [F] Feminino: ")

if sexo == 'M' or sexo == 'm':
    peso_ideal = (72.7 * altura) - 58
    print("Sexo Masculino com peso ideal de {0:.2f} kg.".format(peso_ideal))
elif sexo == 'F' or sexo == 'f':
    peso_ideal = (62.1 * altura) - 44.7
    print("Sexo Feminino com peso ideal de {0:.2f} kg.".format(peso_ideal))
else:
    print("Erro. Sexo incorreto!")

    
    
    
    
    