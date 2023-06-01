package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Informe um numero inteiro maior que 0 para analise: ");
		num = teclado.nextInt();
		
		if (num > 100) {
			System.out.println(num + " é maior que 100.");
		}else{
			System.out.println("Este numero é menor que 100!");
		}
		teclado.close();
	}
	
}
