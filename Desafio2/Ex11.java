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
        String palavraReferencia;
        int contadorAnagramas = 0;

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

        
        System.out.println("Digite a palavra de referencia: ");
        palavraReferencia = scanner.nextLine();

        // contar anagramas
        for (String palavraLista : lista) {
            if(ehAnagrama(palavraReferencia, palavraLista)) {
                contadorAnagramas ++;
            }

        }

        System.out.println("Número total de anagramas de '" + palavraReferencia + "': " + contadorAnagramas);

        scanner.close();
    }


    // verifica se as duas palavras tem o mesmo tamanho e se possuem os mesmos caracteres
    private static boolean ehAnagrama (String palavra1, String palavra2) {
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        for (char c: palavra1.toCharArray()) {
            if(contagemCaracter(palavra1, c) != contagemCaracter(palavra2, c)) {
                return false;
            }
        }

        return true;
    }


    // faz a contagem caractere por caractere
    private static int contagemCaracter(String palavra, char caracter ) {
        int contagem = 0;
        for (char c: palavra.toCharArray()) {
            if (c == caracter) {
                contagem++;
            }
        }
        return contagem;
    }
}
