#include <stdio.h>

int main(){
    int num, valor;

    printf(" \n ");
    printf("Informe um numero: ");
    scanf("%d",&num);

    while (num < 1 || num > 10){
        printf("Numero deve estar entre 1 e 10.\n");
        printf("Informe um numero: ");
        scanf("%d",&num);
    }
    printf("Tabuada do %d\n",num);

    for (int i = 1; i <= 10; i++){
        valor = num * i;
        printf("%d X %d = %d\n",num,i,valor);
    }
}