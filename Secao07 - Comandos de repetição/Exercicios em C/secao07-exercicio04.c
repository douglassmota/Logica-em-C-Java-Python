#include <stdio.h>

int main(){
    int maior1 = -99999, menor = 99999, soma = 0, num1;
    float media;

    for (int i = 1; i < 11; ++i){
        printf("Informe %d valor numerico: ",i);
        scanf("%d", &num1);

        if (num1 > 0){
           if (num1 > maior1){
            maior1 = num1;
           }
            if(num1 < menor){
                menor = num1;
            }

     soma = soma + num1; 
        }else{
            i--;   
        }   
    }

    media = soma / 10;
    printf("Maior = %d\n", maior1);
    printf("Menor = %d\n", menor);
    printf("A soma entre todos os numero = %d\n",soma);
    printf("Media entre todos os numeros = %.2f", media);
    
}