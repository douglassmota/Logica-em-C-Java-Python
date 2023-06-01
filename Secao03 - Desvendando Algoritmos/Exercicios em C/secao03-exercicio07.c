#include <stdio.h>

int main(){
    float altura, peso_ideal;

    printf(" \n ");
    printf("Informe sua altura: ");
    scanf("%f",&altura);

    peso_ideal = (altura * 72.7) - 58;

    printf("O peso ideal: %.2f",peso_ideal);


}