package br.com.udemy.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qnt_maxima, qnt_minima, soma;
		float estoque_medio;
		
		System.out.print("Informe a quantidade minima de peças: ");
		qnt_minima = teclado.nextInt();
		System.out.print("Informe a quantidade maxima de peças: ");
		qnt_maxima = teclado.nextInt();
		System.out.println(" ");
		
		soma = qnt_minima + qnt_maxima;
		estoque_medio = soma / 2;
		
		System.out.print("O estoque médio é de " + estoque_medio + " peças.");
		
		teclado.close();

	}

}
