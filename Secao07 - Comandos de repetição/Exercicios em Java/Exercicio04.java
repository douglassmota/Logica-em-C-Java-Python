package br.com.udemy.secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0, maior = -99999, menor = 99999, num;
		float media;
		
		for(int i = 1; i <=10 ; i++) {
			System.out.print("informe o " + i + "º valor: ");
			num = teclado.nextInt();
			
			if(num > 0) {
				if(num > maior) {
					maior = num;
				}
				if(num < menor) {
					menor = num;
				}
				soma = soma + num;
			}else{
				i--;
			}
			}
		
		media = soma / 10;
		
		System.out.println(" ");
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		System.out.println("A media entre todos os numeros é: " + media);
		
		teclado.close();

	}

}
