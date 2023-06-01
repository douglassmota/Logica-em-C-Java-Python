package br.com.udemy.secao07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int id_mouse, qnt = 0, necessita_esfera = 0, necessita_limpeza = 0, necessita_troca = 0, quebrado = 0, defeito;
		float perc_esfera, perc_limpeza, perc_cabo, perc_quebrado;
		
		System.out.print("Informe o Id do mouse: ");
		id_mouse = teclado.nextInt();
		
		while(id_mouse != 0) {
			System.out.println("Identifique o defeito.");
			System.out.println("1 - Necessita de Esfera.");
			System.out.println("2 - Necessita de Limpeza.");
			System.out.println("3 - Necessita troca de cabo ou conector.");
			System.out.println("4 - Qubrado ou inutilizado.");
			System.out.print("Digite o defeito: ");
			defeito = teclado.nextInt();
			System.out.println(" ");
			
				if(defeito == 1) {
					necessita_esfera = necessita_esfera + 1;
				}
				if(defeito == 2) {
					necessita_limpeza = necessita_limpeza + 1;
				}
				if(defeito == 3) {
					necessita_troca = necessita_troca + 1;
				}
				if(defeito == 4) {
					quebrado = quebrado + 1;
				}
				qnt = qnt + 1;
				
			System.out.print("Informe o Id do mouse: ");
			id_mouse = teclado.nextInt();
			System.out.println(" ");
		}
		perc_esfera = (float)(necessita_esfera * 100) / qnt;
		perc_limpeza = (float)(necessita_limpeza * 100) / qnt;
		perc_cabo = (float)(necessita_troca * 100) / qnt;
		perc_quebrado = (float)(quebrado * 100) / qnt;
		
		System.out.println("Quantidade total de mouses --> " + qnt);
		System.out.println("Situacao \t\t\t\t\t Quantidade \t\t Percentual");
		System.out.printf("1 - Necessita de Esfera \t\t\t\t %d \t\t%.2f%%\n",necessita_esfera,perc_esfera);
		System.out.printf("2 - Necessita de Limpeza \t\t\t\t %d \t\t%.2f%%\n",necessita_limpeza,perc_limpeza);
		System.out.printf("3 - Necessita de troca de cabo ou conector \t\t %d \t\t%.2f%%\n",necessita_troca,perc_cabo);
		System.out.printf("4 - Quebrado ou Inutilizado \t\t\t\t %d \t\t%.2f%%\n",quebrado,perc_quebrado);
		
		teclado.close();
	}

}
