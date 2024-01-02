//Escreva um programa que conte o número de ocorrências de cada palavra em uma string.


import java.util.Scanner;

public class Ex05 {

    public static void contarPalavras(String frase) {
        
        // limpando pontuacao, deixando tudo em minuscula e repartindo a string em vetor de palavras
        frase = frase.toLowerCase().replaceAll("[^a-z ]", "");
        String[] palavras = frase.split(" ");

        //Iniciando vetores para contagem de palavras unicas e sua quantidade de ocorrencias
        String[] palavrasUnicas = new String[palavras.length];
        int[] ocorrencias = new int[palavras.length];

        int indice = 0;

        // For para percorrer a frase
        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i];
            boolean encontrada = false;

            // Verifica se a palavra ja esta no vetor de palavras unicas e soma no vetor de contagem caso positivo
            for (int j = 0; j < indice; j++) {
                if (palavrasUnicas[j].equals(palavra)) {
                    ocorrencias[j]++;
                    encontrada = true;
                    break;
                }
            }

            // Se a palavra nao foi encontrada, adiciona ao vetor de palavras unicas
            if (!encontrada) {
                palavrasUnicas[indice] = palavra;
                ocorrencias[indice] = 1;
                indice++;
            }
        }

        // Printando tudo
        System.out.println("Contagem de Palavras:");
        for (int i = 0; i < indice; i++) {
            System.out.println(palavrasUnicas[i] + ": " + ocorrencias[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma frase com palavras separadas por espaços: ");
        String frase = in.nextLine();

        contarPalavras(frase);

        in.close();
    }
}