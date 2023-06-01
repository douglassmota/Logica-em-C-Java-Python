package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float altura, peso_ideal;
		char sexo;
		
		System.out.print("Informe sua altura: ");
		altura = teclado.nextFloat();
		System.out.print("Informe o sexo Homem [H] ou Mulher [M]: ");
		sexo = teclado.next().charAt(0);
		
		if (sexo == 'H' || sexo == 'h') {
			peso_ideal = (float)(72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é %.2f",peso_ideal," kg.");
		}
		
		if (sexo == 'M' || sexo == 'm') {
			peso_ideal = (float)(62.1 * altura) - 58;
			System.out.printf("Seu peso ideal é %.2f",peso_ideal," kg.");
		}
		
		if (sexo != 'H' && sexo != 'h' && sexo != 'M' && sexo != 'm') {
			System.out.println("Sexo não reconhecido!");
		}
		
		teclado.close();

	}

}
