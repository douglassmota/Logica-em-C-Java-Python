#include <stdio.h>

int main(){
    int codigo_operador, horas_trabalhadas;
    float salario, extra, excedente, salario_extra;

     printf(" \n ");
     printf("Operador informe seu codigo: ");
     scanf("%d", &codigo_operador);
     printf("Quantas horas voce trabalhou este mes? ");
     scanf("%d", &horas_trabalhadas);

     salario = horas_trabalhadas * 10;

    if (horas_trabalhadas < 50){
    
     printf("Voce trabalhou %d horas nao excedendo o limite e vai receber R$ %.2f.",horas_trabalhadas,salario);
    }
     

     if (horas_trabalhadas > 50){
        excedente = horas_trabalhadas - 50;
        extra = excedente * 20;
        salario_extra = (50 * 10) + extra;
       printf("Voce trabalhou %d horas, excedendo %.1f horas. Sua hora extra sera de %.2f. Seu salario total com extra R$ %.2f",horas_trabalhadas,excedente,extra,salario_extra);
     }
}