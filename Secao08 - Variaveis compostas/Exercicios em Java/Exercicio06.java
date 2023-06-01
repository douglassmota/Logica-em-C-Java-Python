package br.com.udemy.secao08;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float[] vetor = new float[5];
		int codigo;
		float valor;
		
		System.out.println("Digite 1 para ordem direta ou 2 para ordem inversa.");
		System.out.print("Digite o codigo: ");
		codigo = teclado.nextInt();
		System.out.println(" ");
		
		if (codigo != 0 && (codigo == 1 || codigo == 2)) {
		for(int i = 0; i < 5; i++) {
			System.out.print("Informe " + (i + 1)+ "º valor: ");
			valor = teclado.nextFloat();
			vetor[i] = valor;
		
		}
		
		if(codigo == 1) {
			System.out.println(" ");
			System.out.println("Vetores na ordem direta.");
			for(int i = 0; i < 5; i++) {
				System.out.print(vetor[i] + " - ");	
			}
		}else if(codigo == 2){
			System.out.println(" ");
			System.out.println("Vetores na ordem inversa.");
			for(int i = 4; i >= 0; i--) {
				System.out.print(vetor[i] + " - ");
			}
		}
		
		}else{
			System.out.println("Codigo Invalido!");
		}
			System.out.println(" ");
			System.out.println("Programa Encerrado");
			teclado.close();
		}
		
	}


