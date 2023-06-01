package br.com.udemy.secao08;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[5];
		int[] pares = new int[5];
		int cont_pares = 0;
	
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite valor para verificação: ");
			vetor[i] = teclado.nextInt();
			
			if(vetor[i] % 2 == 0) {
				if(vetor[i] > 0) {
					pares[cont_pares] = vetor[i];
					cont_pares = cont_pares + 1;
				}
			}
		}
	System.out.println(" ");
	System.out.println("Os seguintes numeros são pares: ");
		for(int i = 0; i < cont_pares; i++) {
			System.out.println(pares[i] + " numero par.");
		}
	teclado.close();
	}

}
