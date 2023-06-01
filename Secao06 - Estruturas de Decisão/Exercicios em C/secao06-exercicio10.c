#include <stdio.h>

// Infantil A = 5 a 7 anos
// Infantil B = 8 a 11 anos 
// Juvenil A = 12 a 13 anos
// Juvenil B = 14 a 17 anos
// Adultos = + 18 anos 

int main(){

    int idade;

    printf(" \n ");
    printf("Informe sua idade: ");
    scanf("%d",&idade);

     if (idade <= 4){
        printf("Idade minina 5 anos.");
     }else if (idade >= 5 && idade <= 7){
        printf("Infantil A.");
            }else if (idade >= 8 && idade <= 11){
                 printf("Infantil B.");
                     }else if (idade >= 12 && idade <= 13){
                         printf("Juvenil A.");
                            }else if (idade >= 14 && idade <= 17){
                                printf("Juvenil B.");
                                    }else if (idade >= 18){
                                         printf("Adulto.");
    }


}