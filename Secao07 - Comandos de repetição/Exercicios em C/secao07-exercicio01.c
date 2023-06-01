#include <stdio.h>

int main(){
    int num, maior;

     printf(" \n ");
     printf("Informe um valor qualquer: ");
     scanf("%d",&num);

    maior = 0;

     while (num != 0){
        if (num > maior){
            maior = num;
        }
            printf("Informe um valor qualquer: ");
            scanf("%d",&num);
     }

     printf("O maior valor = %d.",maior);
}