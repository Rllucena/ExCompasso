/*
Desenvolva um programa que determine se uma string é uma
sequência de Fibonacci
 */

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str;
        boolean fibonacci = true;

        System.out.println("Digite uma string numérica (separada por virgulas) :");
        str = scanner.nextLine();

        String[] numeros = str.replaceAll("\\s","").split(",");

        for (int i = 0; i < numeros.length - 2; i++){
            int primeiro = Integer.parseInt(numeros[i]);
            int segundo = Integer.parseInt(numeros[i + 1]);
            int soma = primeiro + segundo;
            int terceiro = Integer.parseInt(numeros[i + 2]);

            if (soma != terceiro) {
                fibonacci = false;
            }
        }

        if (fibonacci) {
            System.out.println("É uma sequência de Fibonacci");
        }
        else {
            System.out.println("Não é uma sequência de Fibonacci");
        }

        scanner.close();
    }
}