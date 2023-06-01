# -*- coding: utf-8 -*-
print("Registros de Mouses.\n")
quantidade = 0
necessita_esfera = 0
necessita_limpeza = 0
necessita_troca = 0
quebrado = 0
ident = int(input("Informe o Id do mouse: "))

while ident != 0:
    print("Identifique o defeito.")
    print("1 - Necessita de Esfera.")
    print("2 - Necessita de Limpeza.")
    print("3 - Necessita de Troca do cabo ou conector.")
    print("4 - Quebrado ou inutilizado.")
    print("0 - ENCERRA O PROGRAMA.")
    defeito = int(input("Informe qual o defeito: "))
    print(" ")
    
    if defeito == 1:
        necessita_esfera = necessita_esfera + 1
    if defeito == 2:
        necessita_limpeza = necessita_limpeza + 1
    if defeito == 3: 
        necessita_troca = necessita_troca + 1
    if defeito == 4:
        quebrado = quebrado + 1
        
    quantidade = quantidade + 1
    
    ident = int(input("Informe o Id do mouse: "))
    
perc_esfera = float(necessita_esfera * 100)/quantidade 
perc_limpeza = float(necessita_limpeza * 100)/quantidade  
perc_troca = float(necessita_troca * 100)/quantidade 
perc_quebrado = float(quebrado * 100)/quantidade

print(" ")
print("Temos um total de {0} mouses.".format(quantidade))
print("Situação                                            Quantidade           Percentual ")
print("1 - Necessita de Esfera                                {0}                   {1:.2f}%   ".format(necessita_esfera, perc_esfera))
print("2 - Necessita de Limpeza.                              {0}                   {1:.2f}%   ".format(necessita_limpeza, perc_limpeza))
print("3 - Necessita de Troca do cabo ou conector.            {0}                   {1:.2f}%   ".format(necessita_troca, perc_troca))
print("4 - Quebrado ou inutilizado.                           {0}                   {1:.2f}%   ".format(quebrado, perc_quebrado))

                    