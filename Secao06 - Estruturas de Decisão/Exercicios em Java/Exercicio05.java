package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int peso, excesso, multa;
		
		System.out.print("Temos quantos Kilos de peixe? ");
		peso = teclado.nextInt();
		
		if(peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
			System.out.println("Voce excedeu em "+ excesso + "kg e vai pagar R$" + multa + " multa.");
		}else{
			System.out.println("Voce não excedeu o limite de 50kg.");
		}
		teclado.close();
	}

}
