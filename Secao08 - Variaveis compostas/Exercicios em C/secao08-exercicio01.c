#include <stdio.h>

int main(){
    int num [5], pares [5], cont_pares = 0;

    for (int i = 0; i < 5; i++){

        printf("Digite valor para verificacao: ");
        scanf("%d",&num[i]);

        if (num[i] % 2 == 0){
            if (num[i] > 0){
                pares[cont_pares] = num[i];
                cont_pares = cont_pares + 1;
            }
          }

    }      

    printf(" \n ");
    printf("Os seguintes numeros sao par: \n");
    for (int i = 0; i < cont_pares; i++){
                printf("%d numero par.\n",pares[i]);

            }  
}