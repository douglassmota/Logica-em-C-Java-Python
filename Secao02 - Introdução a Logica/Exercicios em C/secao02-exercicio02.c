#include <stdio.h>

int main () {

	int num1 , num2, soma, multiplicacao;


    printf(" \n ");
	printf("Somando e multiplicando pelo primeiro numero.\n");
    printf(" \n ");
	printf("Por favor informe o primeiro numero: ");
	scanf("%d", &num1);
	printf("Por favor informe o segundo numero: ");
	scanf("%d", &num2);

	soma = num1 + num2;
	multiplicacao = soma * num1;

	printf("O valor da soma dos numeros e multiplicacao: %d",multiplicacao);
    printf(" \n ");

}
