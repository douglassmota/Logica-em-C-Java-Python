#include <stdio.h>

int main(){
    int peso_peixe, excesso;
    float multa;

    printf(" \n ");
    printf("Informe a quantidade Kilos, de peixes pescado: ");
    scanf("%d",&peso_peixe);

    excesso = 0;
    multa = 0;

    if (peso_peixe > 50){
        excesso = peso_peixe - 50;
        multa = excesso * 4;

        printf("O peso de peixe pescado foi %d Kg, excedendo %d Kg. Sua multa sera de R$ %.2f.",peso_peixe,excesso,multa);
    }

    if (peso_peixe < 50){
        printf("O peso de peixe pescado foi %d kg, dentro do padrao permitido. Multa de R$ %.2f",peso_peixe,multa);
    }
}