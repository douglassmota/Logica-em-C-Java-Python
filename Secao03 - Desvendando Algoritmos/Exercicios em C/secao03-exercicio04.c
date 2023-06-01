#include <stdio.h>

int main(){
    int num1, num2, soma;

    printf(" \n ");
    printf("---------- Somar 2 numeros --------------\n");
    printf("Informe o primeiro numero: ");
    scanf("%d",&num1);
    printf("Informe o segundo numero: ");
    scanf("%d",&num2);

    soma = num1 + num2;

    printf("O valor da soma: %d",soma);

}