package br.com.udemy.secao03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, soma;
		
		System.out.print("Informe o primeiro numero: ");
		num1 = teclado.nextInt();
		System.out.print("Informe o segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println(" ");
		
		soma = num1 + num2;
		
		System.out.print("O valor da soma entre os numeros é " + soma);
		
		teclado.close();

	}

}
