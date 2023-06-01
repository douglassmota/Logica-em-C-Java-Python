#include <stdio.h>

int main(){
    printf("\n");
    printf("------------ Numeros impares entre 100 e 200 -------------\n");

    for(int i = 100; i <= 200; i++){
        if (i % 2 != 0){
            printf("Impar: %d\n",i);
        }
    }
}