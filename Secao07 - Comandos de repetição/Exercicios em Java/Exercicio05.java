package br.com.udemy.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, senha;
		
		System.out.print("Informe seu usuario: ");
		nome = teclado.next();
		System.out.print("Informe sua senha: ");
		senha = teclado.next();
		
		
		while(nome.equals(senha)) {
			System.out.println("Erro! Nome não pode ser igual a senha.");
			System.out.println(" ");
			
			System.out.print("Informe seu usuario: ");
			nome = teclado.next();
			System.out.print("Informe sua senha: ");
			senha = teclado.next();
		}
		teclado.close();
	}

}
