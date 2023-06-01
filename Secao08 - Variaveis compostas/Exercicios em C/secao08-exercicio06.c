#include <stdio.h>

int main(){
    int codigo, vetor[5];

    printf(" \n ");
    printf("---------------------------------------------\n");
    printf("Codigo 1 Vetor na ordem direta.\n");
    printf("Codigo 2 Vetor na ordem inversa.\n");
    printf("Codigo 0 encerra o programa\n");
    printf("---------------------------------------------");
    printf(" \n ");
    printf("Informe o codigo que deseja: ");
    scanf("%d",&codigo);

    if(codigo != 0){
        for(int i = 0; i < 5; i++){
            printf("Digite valor: ");
            scanf("%d",&vetor[i]);
        }
        
        if(codigo == 1){
            printf("Vetores na ordem direta = ");
                for(int i = 0; i < 5; i++){
                    printf("%d - ",vetor[i]);
                }

        printf("\n");
                  }else if(codigo == 2){
                    printf("Vetores na ordem inversa = ");
            for(int i = 4; i >= 0; i--){
                printf("%d - ", vetor[i]);
            }
            printf("\n");
        }
        else{
            printf("Codigo inválido!\n");
        }
    }
    else{
        printf("Programa encerrado.\n");
    }
}