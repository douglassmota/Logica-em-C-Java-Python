package br.com.udemy.secao08;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] soma = new int[10];
		int valor1, valor2;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o primeiro valor: ");
			valor1 = teclado.nextInt();
			System.out.print("Digite o segundo valor: ");
			valor2 = teclado.nextInt();
			
			vetor1[i] = valor1;
			vetor2[i] = valor2;
			soma[i] = valor1 + valor2;
		}
		System.out.println(" ");
		System.out.println("Resultado da soma dos elementos de mesmo indice.");
		for(int i = 0; i < 10; i++) {
			System.out.println(soma[i]);
		}
		teclado.close();
	}

}
