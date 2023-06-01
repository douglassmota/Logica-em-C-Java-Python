#include <stdio.h>
#include <math.h>

int main(){
    int num1, num2, num3, num4, q1, q2, q3, q4;

    printf(" \n ");
    printf("Informe o primeiro numero: ");
    scanf("%d",&num1);
    printf("Informe o segundo numero: ");
    scanf("%d",&num2);
    printf("Informe o terceiro numero: ");
    scanf("%d",&num3);
    printf("Informe o quarto numero: ");
    scanf("%d",&num4);
    printf(" \n ");

    q1 = (pow(num1,2)+0.5);
    q2 = (pow(num2,2)+0.5);
    q3 = (pow(num3,2)+0.5);
    q4 = (pow(num4,2)+0.5);

    if (q3 >= 1000){
        printf("O Quadrado do terceiro numero e maior que 1000, sendo = %d",q3);
     }else{
        printf("%d elevado ao quadrado = %d.\n",num1,q1);
        printf("%d elevado ao quadrado = %d.\n",num2,q2);
        printf("%d elevado ao quadrado = %d.\n",num3,q3);
        printf("%d elevado ao quadrado = %d.\n",num4,q4);
    }


}