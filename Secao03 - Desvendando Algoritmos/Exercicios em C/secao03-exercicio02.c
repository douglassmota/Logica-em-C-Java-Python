#include <stdio.h>

int main(){
    int qnt_minima, qnt_max, soma;
    float estoque_med;

    printf("\n");
    printf("------------ Calculo de Estoque Medio ------------");
    printf("\n");
    printf("Informe a quantidade minima de pecas: ");
    scanf("%d",&qnt_minima);
    printf("Informe a quantidade maxima de pecas: ");
    scanf("%d",&qnt_max);

    soma = qnt_minima + qnt_max;
    estoque_med = soma / 2;

    printf("Estoque medio de pecas: %.2f",estoque_med);

}