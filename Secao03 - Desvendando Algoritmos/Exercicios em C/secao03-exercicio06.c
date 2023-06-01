#include <stdio.h>

int main(){
    float valor_hora, salario;
    int horas_trab;

    printf(" \n ");
    printf("---------- Calculo Salario ----------");
    printf("\n");
    printf("Quantas horas foram trabalhadas no mes: ");
    scanf("%d",&horas_trab);
    printf("Quanto voce ganha por hora? ");
    scanf("%f",&valor_hora);

    salario = horas_trab * valor_hora;

    printf("Por mes tenho de salario: %.2f",salario);


}