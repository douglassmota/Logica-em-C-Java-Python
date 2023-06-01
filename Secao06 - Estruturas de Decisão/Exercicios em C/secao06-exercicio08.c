#include <stdio.h>

int main(){
    int num1;

    printf(" \n ");
    printf("Informe um numero inteiro para verificacao: ");
    scanf("%d",&num1);

    if (num1 % 2 == 0){
        printf("Numero par.\n");
        }else{
            printf("Numero impar.\n");
    }
    if (num1 > 0){
        printf("Numero maior que zero.");
        }else{
            printf("Numero menor que zero.");

    }
}