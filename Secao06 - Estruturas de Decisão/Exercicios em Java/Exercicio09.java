package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float poluicao;
		
		System.out.print("Informe o nivel de poluição: ");
		poluicao = teclado.nextFloat();
		
		if(poluicao >= 0.3 && poluicao < 0.4) {
			System.out.println("Grupo 1 suspender atividades.");
		}else if(poluicao >= 0.4 && poluicao < 0.5){
			System.out.println("Grupo 1 e 2 suspender atividades.");
		}else if (poluicao >= 0.5){
			System.out.println("Todos os grupos suspender atividades");
		}else{
			System.out.println("Niveis aceitaveis.");
		}
		teclado.close();
	}

}
