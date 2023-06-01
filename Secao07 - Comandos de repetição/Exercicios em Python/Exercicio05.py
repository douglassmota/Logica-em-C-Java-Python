# -*- coding: utf-8 -*-
nome = input("Informe seu usuario: ")
senha = input("Informe sua senha: ")

if senha == nome:
    print("Erro! Senha não pode ser igual ao nome.\n")
    nome = input("Informe seu usuario: ")
    senha = input("Informe sua senha: ")
else:
    print("Parabens! Usuario Logado.")