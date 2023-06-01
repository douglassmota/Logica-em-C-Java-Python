package br.com.udemy.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horas_trabalhadas; 
		float valor_hora, calcula_salario;
		
		System.out.print("Quantas horas você trabalhou neste mes? ");
		horas_trabalhadas = teclado.nextInt();
		System.out.print("Qual valor da hora? ");
		valor_hora = teclado.nextFloat();
		System.out.println(" ");
		
		calcula_salario = horas_trabalhadas * valor_hora;
		
		System.out.println("O seu salario neste mes é de R$" + calcula_salario);
		
		teclado.close();

	}

}
