# -*- coding: utf-8 -*-
vetor = []

for i in range(1,11):
    num1 = int(input("Digite {0}º valor: ".format(i)))
    vetor.append(num1)

print(" ") 
print("Valores inversos!")    
vetor.reverse()
for i in vetor:
    print(i)    