package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		int num, par, impar;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um numero inteiro para verificação: ");
		num = teclado.nextInt();
		
		if(num % 2 == 0) {
			par = num;
			System.out.println(par + " = numero par.");
		}else{
			impar = num;
			System.out.println(impar + " = numero impar.");
		}
		teclado.close();
	}

}
