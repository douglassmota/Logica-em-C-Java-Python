#include <stdio.h>

int main(){
    int ident, qnt = 0, necessita_esfera = 0, necessita_limpeza = 0, necessita_cabo = 0, quebrado = 0, defeito;

    printf(" \n ");
    printf("Digite o id do mouse: ");
    scanf("%d", &ident);

    while (ident != 0){
        printf("Identifique o defeito.\n");
        printf("1 - Necessita de Esfera.\n");
        printf("2 - Necessita de Limpeza.\n");
        printf("3 - Necessita da troca de cabo ou conector.\n");
        printf("4 - Quebrado ou inutilizavel.\n");
        printf("Qual o defeito do mouse: ");
        scanf("%d",&defeito);
        printf(" \n ");

        if(defeito == 1){
            necessita_esfera = necessita_esfera + 1;
        }
        if(defeito == 2){
            necessita_limpeza = necessita_limpeza + 1;
        }
        if(defeito == 3){
            necessita_cabo = necessita_cabo + 1;
        }
        if(defeito == 4){
            quebrado = quebrado + 1;
        }
        qnt = qnt + 1;
    
    printf(" \n ");
    printf("Digite o id do mouse: ");
    scanf("%d", &ident);

    }
float perc1, perc2, perc3, perc4;
perc1 = ((float)necessita_esfera / (float)qnt * 100);
perc2 = ((float)necessita_limpeza / (float)qnt * 100);
perc3 = ((float)necessita_cabo / (float)qnt * 100);
perc4 = ((float)quebrado / (float)qnt * 100);

printf("Quantidade total de mouse %d.",qnt);
printf("Situacao \t\t\t Quantidade \t\t Percentual\n");
printf("1 - Necessita de Esfera \t\t\t\t %d \t\t\t%.2f%%\n",necessita_esfera,perc1);
printf("2 - Necessita de Limpeza \t\t\t\t %d \t\t\t%.2f%%\n",necessita_limpeza,perc2);
printf("3 - Necessita de troca de cabo ou conector \t\t %d \t\t%.2f%%\n",necessita_cabo,perc3);
printf("4 - Quebrado ou Inutilizado \t\t\t\t %d \t\t\t%.2f%%\n",quebrado,perc4);

}