package lista_exer_java;

import java.util.Scanner;

public class exer02 {

//2- Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
		int n1,n2, n3;
		Scanner numeros = new Scanner(System.in);
		
		System.out.println("Qual o primeiro número? ");
		n1 = numeros.nextInt();
		
		System.out.println("Qual o segundo? ");
		n2 = numeros.nextInt();
		
		System.out.println("Qual o terceito? ");
		n3 = numeros.nextInt();
		
		if(n1 <= n2 && n1 <= n3 && n2 <= n3){
			System.out.println("A ordem correta é " + n1 + "," + n2 + ","+ n3);
		}
		else if (n1 <= n2 && n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem correta é " + n1 + "," + n3 + ","+ n2);
		}
		else if (n2 <= n1 && n2 <= n3 && n1 <= n3) {
			System.out.println("A ordem correta é " + n2 + "," + n1 + ","+ n3);
		}
		else if(n2 <= n1 && n2 <= n3 && n3 <= n1){
			System.out.println("A ordem correta é " + n2 + "," + n3 + ","+ n1);
		}
		else if(n3 <= n1 && n3 <= n2 && n1 <= n2) {
			System.out.println("A ordem correta é " + n3 + "," + n1 + ","+ n2);
		}
		else if(n3 <= n1 && n3 <= n2 && n2 <= n1){
			System.out.println("A ordem correta é " + n3 + "," + n2 + ","+ n1);
		}
	}

}
