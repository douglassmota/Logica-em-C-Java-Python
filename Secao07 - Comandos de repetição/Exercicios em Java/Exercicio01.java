package br.com.udemy.secao07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, maior = 0;
		
		System.out.print("Informe um numero: ");
		num = teclado.nextInt();
		
		while (num != 0) {
			if (num > maior) {
				maior = num;
			}
			System.out.print("Informe um numero: ");
			num = teclado.nextInt();
		}
		System.out.println(" ");
		System.out.println("O maior valor é = " + maior);
		
		teclado.close();
	}

}
