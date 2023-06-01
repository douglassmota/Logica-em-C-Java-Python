#include <stdio.h>

int main() {

    int vetor[20], soma = 0;

    for (int i = 0; i < 20; i++) {
        printf("Digite o %d valor para a soma: ", i + 1);
        scanf("%d", &vetor[i]);
        soma = soma + vetor[i];
    }

    printf("\n");
    printf("A soma de todos os valores = %d\n", soma);

}