package br.com.udemy.secao08;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[20];
		int soma = 0, valor;
		
		for(int i = 0; i < 20; i++) {
			System.out.print("Informe " + (i + 1) + "º valor: ");
			valor = teclado.nextInt();
			vetor[i] = valor;
			
			soma = soma + valor;
		}
		System.out.println(" ");
		System.out.println("Resultado da soma de todos os valores.");
		System.out.println("Soma = " + soma);
		
		teclado.close();
	}

}
