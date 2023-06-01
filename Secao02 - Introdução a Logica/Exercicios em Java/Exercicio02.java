package br.com.udemy.secao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int num1, num2, multiplicar, somar;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		num1 = teclado.nextInt();
		System.out.print("Informe o segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println(" ");
		
		somar = num1 + num2;
		multiplicar = somar * num1;
		
		System.out.println("Somar o primeiro numero com segundo e após multiplicar a soma pelo primero numero!");
		System.out.print("O valor da multiplicação é: " + multiplicar);
		
		teclado.close();	

	}

}
