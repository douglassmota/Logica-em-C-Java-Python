#include <stdio.h>

int main(){
    
    int vetor1[10], vetor2[10], soma[10];

    for (int i = 0; i < 10; i++){
        printf("Digite valor para o primeiro vetor: ");
        scanf("%d",&vetor1[i]);
        printf("Digite valor para o segundo vetor: ");
        scanf("%d",&vetor2[i]);
        printf(" \n ");
        soma[i] = (vetor1[i] + vetor2[i]);
    }

     printf(" \n ");
     printf("Resultado da soma entre os vetores de mesmo indice \n");

        for(int i = 0; i < 10; i++){
            printf("%d \n",soma[i]);

        }

}