package lista_exer_java;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class exer01 {

    public static void main(String[] args) {

        int n1,n2,n3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();

        System.out.println("Digite o terçeiro número: ");
        n3 = entrada.nextInt();

        if(n1 > n2 && n1 > n3) {
            System.out.println("O primeiro número digitado foi o maior " + n1);
        }

        else if(n3 < n2) {
            System.out.println("O segundo número digitado foi o maior "+ n2);
        }

        else {
            System.out.println("O terceiro número digitado foi o maior "+ n3);
        }

    }
}
