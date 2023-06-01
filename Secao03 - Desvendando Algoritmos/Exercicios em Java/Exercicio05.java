package br.com.udemy.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float metros, centimetros;
		
		System.out.print("Informe o tamanho em metros: ");
		metros = teclado.nextFloat();
		
		centimetros = metros * 100;
		
		System.out.print("A conversão de " + metros + " metros para cm é " + centimetros + " cm.");
		
		teclado.close();

	}

}
