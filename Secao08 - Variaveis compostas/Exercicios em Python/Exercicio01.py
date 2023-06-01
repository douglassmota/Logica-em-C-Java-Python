# -*- coding: utf-8 -*-
vetor = []
pares = []

for num in range(1,21):
    vetor.append(num)
    if num % 2 == 0:
        pares.append(num)
print("Contagem apenas de numeros pares.\n")
for par in pares:
    print(par)