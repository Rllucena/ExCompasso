/*
Desenvolva um programa que calcule a soma dos quadrados dos
números em uma lista
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Ex26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanhoLista;
        int numero;
        int quadrado;
        int soma = 0;
        List<Integer> lista = new ArrayList<>();

        System.out.println("Digite o tamanho da lista: ");
        tamanhoLista = scanner.nextInt();

        // montando a lista
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println("Digite o numero da posicao " + (i));
            numero = scanner.nextInt();
            lista.add(numero);
        }

        // mostrando a lista e pegando o valor de cada posição para extrair seu quadrado, logo após somando o valor à variavel soma
        System.out.println("Lista: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("posicao " + i + ": " + lista.get(i));
            quadrado = lista.get(i) * lista.get(i);
            soma += quadrado;
        }

        // exibe a soma de todos os quadrados da lista
        System.out.println("a soma dos quadrados é: " + soma);
        scanner.close();
    }
}
