package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		
		// Infantil A = 5 a 7 anos
		// Infantil B = 8 a 11 anos
		// Juvenil A = 12 a 13 anos
		// Juvenil B = 14 a 17 anos
		// Adultos +18 anos
		
		System.out.print("Informe sua idade para classificarmos: ");
		idade = teclado.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
		}else if (idade >= 8 && idade <= 11){
			System.out.println("Infantil B");
		}else if (idade >= 12 && idade <= 13){
			System.out.println("Juvenil A");
		}else if (idade >= 14 && idade <= 17){
			System.out.println("Juvenil B");
		}else if (idade >= 18){
			System.out.println("Adulto");
		}else{
			System.out.println("Idade não aceita. Minimo 5 anos!");
		}
		teclado.close();
	}

}
