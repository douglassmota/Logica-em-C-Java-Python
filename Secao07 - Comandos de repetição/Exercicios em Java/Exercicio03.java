package br.com.udemy.secao07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 100; i <= 200; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " Impar.");
			}
		}
		teclado.close();
	}

}
