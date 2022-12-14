package lista_exer_java;

import java.util.Scanner;

public class exer03 {
//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//categoria ela se encontra:10-14 infantil, 15-17 juvenil, 18-25 adulto

	public static void main(String[] args) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a sua idade: ");
		idade = entrada.nextInt();
		
		if (idade >= 10 && idade <= 14){
			System.out.println("Categoria infantil.");
		}
		else if (idade > 14 && idade <= 17) {
			System.out.println("Categoria juvenil.");
		}	
		else if(idade >17 && idade <= 25) {
			System.out.println("Categoria adulto.");
		}
		
	}

}
