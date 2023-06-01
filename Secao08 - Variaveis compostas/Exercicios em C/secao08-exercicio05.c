#include <stdio.h>

int main(){
    int vetor[10];
    char maior_50 = 0;

    for(int i = 0; i < 10; i++){
        printf("Digite o %d. valor: ", i+1);
        scanf("%d",&vetor[i]);

    }

    printf(" \n ");

    for(int i = 0; i < 10; i++){
         if(vetor[i] > 50){
                printf("Valor %d , maior que 50 e esta na posicao %d. \n",vetor[i],i+1);
                maior_50 = 1;
            }
    }

   if (maior_50 < 1){
    printf("Nao existem numeros maiores que 50.");
   }

} 