import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
7. Crie um programa que remova os elementos repetidos de uma lista encadeada.
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        variável uniqueSet do tipo Set que contém elementos do tipo Integer.
        Ou seja, é um conjunto que armazenará números inteiros.

        HashSet = significa que o tipo do conjunto é inferido a
        partir do tipo declarado na variável (Integer neste caso).
         */
        Set<Integer> uniqueSet = new HashSet<>();

        System.out.println("Digite os elementos da lista (digite 'fim' para encerrar):");

            while (true) {
                // Solicitar ao usuário que digite um elemento
                System.out.print("Elemento (ou 'fim' para encerrar): ");
                String input = scanner.next();

                // Verificar se o usuário deseja encerrar a entrada
                if (input.equalsIgnoreCase("fim")) {
                    break;
                }

                try {
                    // Converter a entrada para um número inteiro
                    int element = Integer.parseInt(input);

                    // Adicionar o elemento ao conjunto (automaticamente remove duplicatas)
                    uniqueSet.add(element);
                } catch (NumberFormatException e) {
                    // Lidar com entrada inválida (não inteira)
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                }
            }

            // Imprimir os elementos únicos do conjunto
            System.out.println("Lista após remoção de duplicatas:");
            uniqueSet.forEach(element -> System.out.print(element + " "));

            // Fechar o scanner
            scanner.close();
        }
    }