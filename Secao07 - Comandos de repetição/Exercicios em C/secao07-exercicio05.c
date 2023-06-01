#include <stdio.h>
#include <string.h>

int main(){
    char nome[100], senha[100];

    printf(" \n ");
    printf("Informe Usuario: ");
    gets(nome);
    printf("Informe a senha: ");
    gets(senha);

    while (!strcmp(nome,senha)){ // Compara 02 Strings 
    
        printf("Senha nao pode ser igual ao usuario.\n");
        printf("Informe Usuario novamente: ");
        gets(nome);
        printf("Informe a senha: ");
        gets(senha);
        
    }

 if(nome != senha){
            printf("Usuario logado com sucesso!");
        }   

}