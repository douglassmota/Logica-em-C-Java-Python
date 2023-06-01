package br.com.udemy.secao07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, valor;
		
		System.out.print("Informe um numero de 1 a 10: ");
		num = teclado.nextInt();
		
		while (num < 1 || num > 10) {
			System.out.println("Erro! Numero deve estar entre 1 e 10.");
			System.out.println(" ");
			System.out.print("Informe um numero de 1 a 10: ");
			num = teclado.nextInt();
		}
		System.out.println(" ");
		System.out.println("Tabuada do numero " + num);
		for(int i = 0; i <= 10; i++) {
			valor = num * i;
			System.out.println(num + " X " + i + " = " + valor);
		}
		teclado.close();
	}

}
