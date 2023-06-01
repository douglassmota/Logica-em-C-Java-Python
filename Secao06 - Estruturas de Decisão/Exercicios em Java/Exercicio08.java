package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		
		System.out.print("Informe um numero para analise: ");
		num1 = teclado.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("Este numero é par.");
		}else{
			System.out.println("Este numero é impar.");
		}
		
		if(num1 > 0){
			System.out.println("Numero maior que 0.");
		}else{
			System.out.println("Numero menor que 0.");
		}
		teclado.close();
	}

}
