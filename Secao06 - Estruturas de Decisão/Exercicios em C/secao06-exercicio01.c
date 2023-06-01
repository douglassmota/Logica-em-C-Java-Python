#include <stdio.h>

int main(){
    int n;

    printf(" \n ");
    printf("Por favor informe um numero inteiro qualquer: ");
    scanf("%d",&n);

    if (n>100){
        printf("Valor %d - maior que 100!",n);
    }else{
        n = 0;
        printf("Menor que 100 valor = %d",n);
    }
}