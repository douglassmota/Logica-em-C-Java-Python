package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float horas_trabalhadas, salario, extra, salario_extra, excesso;
		int codigo;
		
		System.out.print("Por favor me informe seu codigo: ");
		codigo = teclado.nextInt();
		System.out.print("Quantas horas você trabalhou este mes? ");
		horas_trabalhadas = teclado.nextFloat();
		
		salario = horas_trabalhadas * 10;
		
		if (horas_trabalhadas > 50) {
			excesso = horas_trabalhadas - 50;
			extra = excesso * 20;
			salario_extra = (float)(50 * 10) + extra;
			System.out.printf("Codigo "+ codigo + ", você trabalhou " + horas_trabalhadas + " horas e vai receber R$ %.2f", salario_extra);
		}
		if (horas_trabalhadas <= 50) {
			System.out.printf("Codigo "+ codigo + ", você trabalhou " + horas_trabalhadas + " horas e vai receber R$ %.2f",salario);
		}
		teclado.close();
	}

}
