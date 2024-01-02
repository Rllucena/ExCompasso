/*
Escreva um programa que conte o número de anagramas de uma
palavra em uma lista de palavras.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanhoLista;
        String palavra;

        List<String> lista = new ArrayList<>();

        System.out.println("Digite o tamanho da lista: ");
        tamanhoLista = scanner.nextInt();        


        //para consumir o \n
        scanner.nextLine();

        // montando a lista
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println("Digite a palavra da posicao " + (i));
            palavra = scanner.nextLine();
            lista.add(palavra);
        }

        // mostrando a lista
        System.out.println("Lista: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("posicao " + i + ": " + lista.get(i));
        }

        scanner.close();
    }
}
