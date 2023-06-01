# -*- coding: utf-8 -*-
print("Indice de poluição.\n")
poluicao = float(input("Informe o indice de poluição da sua empresa: "))

if poluicao >= 0.3 and poluicao < 0.4:
    print("Grupo 01 Suspender Atividades.")
elif poluicao >= 0.4 and poluicao < 0.5:
    print("Grupo 01 e Grupo 02 Suspender Atividades.")
elif poluicao >= 0.5:
    print("Todos os grupos Suspender Atividades.")
else:
    print("Niveis aceitaveis.")