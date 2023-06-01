package br.com.udemy.secao08;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[10];
		int valor, maior_50 = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + "º valor: ");
			valor = teclado.nextInt();
			vetor[i] = valor;
			
			if(valor > 50) {
				System.out.println("Valor " + valor + " maior do que 50 na posição "+ (i+1));
				System.out.println(" ");
				maior_50 = 1;
			}
		}
		if (maior_50 == 0) {
			System.out.println("Não existem valores maiores que 50");
		}
		teclado.close();

	}

}
