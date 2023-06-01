package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, positivo, negativo;
		
		System.out.print("Informe um numero inteiro (Positivo ou Negativo): ");
		num = teclado.nextInt();
		
		if (num > 0) {
			positivo = num;
			System.out.println(positivo + " é positivo.");
		}else{
			negativo = num;
			System.out.println(negativo + " é negativo.");
		}
		teclado.close();
		}

}
