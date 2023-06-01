#include <stdio.h>

int main(){
    int n, a, b;

    printf(" \n ");
    printf("Por favor informe um numero inteiro qualquer: ");
    scanf("%d",&n);

    if (n>0){
        a = n;
        printf("Valor positivo = ");
        printf("%d",a);
            }else{
                b = n;
                printf("Valor negativo = ");
                printf("%d",b);

    }
}