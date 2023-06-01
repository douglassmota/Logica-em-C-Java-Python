# -*- coding: utf-8 -*-
print("Codigo 0 = Encerra o programa.")
print("Codigo 1 = Vetor na ordem inversa.")
print("Codigo 2 = Vetor na ordem direta.")
codigo = int(input("Informe codigo: "))
print( )
vetor = []


if codigo > 0:
    for i in range(1,6):
        num = int(input("Informe {0}º numero: ".format(i)))
        vetor.append(num)
        
print(" ")        
if codigo == 1:
    print("Vetor na ordem Inversa.")
    vetor.reverse()
    for i in vetor:
        print(i)
        
print(" ")       
if codigo == 2:
    print("Vetor na ordem direta.") 
    for i in vetor:
        print(i)
        
if codigo <= 0:
    print("Programa encerrado!")                        
        