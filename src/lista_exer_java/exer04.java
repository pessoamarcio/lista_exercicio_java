package lista_exer_java;

import java.util.Scanner;

public class exer04 {
//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.


	public static void main(String[] args) {
		int numero; 
		double raiz, quadrado;
		Scanner parimpa = new Scanner(System.in);
		
		System.out.println("Qual o número? ");
		numero = parimpa.nextInt();
		
		if (numero %2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("O número " + numero + " é par e a raiz é %.2f ", raiz);
		}
		else{
			quadrado = Math.pow (numero,2 );
			System.out.println("O número " + numero + " é impar e o seu quadrado é " + quadrado + ".");
		}
	}
}
