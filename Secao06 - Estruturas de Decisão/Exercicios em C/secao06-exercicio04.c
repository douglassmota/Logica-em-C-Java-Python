#include <stdio.h> 
#include <ctype.h>

int main(){
    float altura, peso_ideal;
    char sexo;

    printf(" \n ");
    printf("Informe sua altura: ");
    scanf("%f",&altura);
    getchar();  // Limpa o buffer de entrada do teclado, correção de erro!
    printf("Genero Masculino [M] ou Feminino [F] ? ");
    scanf("%c", &sexo);

    if (toupper(sexo) == 'M') {  // Converte o caractere para maiúsculo
        peso_ideal = (72.7 * altura) - 58;
        printf("O peso ideal para homens %.2f",peso_ideal);

    }

    if (toupper(sexo) == 'F'){  // Converte o caractere para maiúsculo
        peso_ideal = (62.1 * altura) - 44.7;
        printf("O peso ideal para mulheres %.2f",peso_ideal);

    }

    if (sexo != 'M' && sexo != 'F'){
        printf("Sexo nao reconhecido! \n");
    }
        


}