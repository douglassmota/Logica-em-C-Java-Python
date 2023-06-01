#include <stdio.h>

int main(){
    int mt, cm;

    printf(" \n ");
    printf("------------ Conversor Metros em Centimetros -----------\n");
    printf("\n");
    printf("Por favor informe quantos metros: ");
    scanf("%d",&mt);

    cm = mt * 100;

    printf("Em %d metros temos %d centimetros",mt ,cm);
}