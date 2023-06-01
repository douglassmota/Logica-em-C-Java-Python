package br.com.udemy.secao07;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i % 10 == 0) {
				System.out.println("Multiplo de 10 = " + i);
			}
		}
		teclado.close();
	}

}
