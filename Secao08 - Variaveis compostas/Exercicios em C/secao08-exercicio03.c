#include <stdio.h>

int main(){
    int vetor[10], i;

     printf(" \n ");

     for(int i = 0; i < 10; i++){
        printf("Digite %d valor inteiro: ",i + 1);
        scanf("%d",&vetor[i]);
     }

    i = 9;
    printf(" \n ");
    printf("Ordem decrescente: ");
     while (i >= 0){
        printf("%d -",vetor[i]);
        i = i - 1;
     }
}