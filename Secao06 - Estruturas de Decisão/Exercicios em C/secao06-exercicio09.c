#include <stdio.h>

int main(){
 float poluicao;

 printf(" \n ");
 printf("Informe o nivel de poluicao de sua empresa: ");
 scanf("%f",&poluicao);

 if (poluicao >= 0.3 && poluicao < 0.4){
    printf("Grupo 1 suspender as atividades.");
 }

 if (poluicao >= 0.4 && poluicao < 0.5){
    printf("Grupo 1 e grupo 2 suspender atividades.");
 }

 if(poluicao >= 0.5){
    printf("Todos os grupos suspender atividades");
    
 }

 if(poluicao < 0.3){
    printf("Niveis aceitaveis. Parabens!");
 }


}