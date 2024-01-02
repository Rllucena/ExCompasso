/*
Desenvolva um programa que determine se um número é um
palíndromo especial.
 */

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String numeroStr;
        String invertidaStr;
        

        System.out.println("Digite o numero: ");
        numero = scanner.nextInt();

        // converte para string
        numeroStr = Integer.toString(numero);

        // inverte a string
        invertidaStr = new StringBuilder(numeroStr).reverse().toString();

        // compara a string invertida com a palavra selecionada e verifica se é um palindromo especial
        if (invertidaStr.equals(numeroStr)) {
            System.out.println("O numero " + numero + " é um palindromo especial");
        }
        else {
            System.out.println("o numero " + numero + " nao é um palindromo especial");
        }

        scanner.close();
    }
}
