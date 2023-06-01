package br.com.udemy.secao08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[10];
		int valor;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um valor: ");
			valor = teclado.nextInt();
			vetor[i] = valor;
		}
		
		int i = 9;
		System.out.println(" ");
		System.out.println("Ordem decrescente: ");
		while(i >=0) {
			System.out.print(vetor[i] + " -");
			i = i - 1;
		}
		
		teclado.close();
	}

}
