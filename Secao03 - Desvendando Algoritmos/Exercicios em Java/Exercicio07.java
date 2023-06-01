package br.com.udemy.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float altura, mult;
		
		System.out.print("Informe a sua Altura: ");
		altura = teclado.nextFloat();
		
		mult = (float)(altura * 72.7f) - 58;
		
		System.out.printf("O seu peso ideal é %.2f", mult);
		
		teclado.close();
	}

}
