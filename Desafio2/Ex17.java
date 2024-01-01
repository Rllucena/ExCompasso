/*
17.Crie um programa que encontre o segundo menor elemento em um vetor.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = teclado.nextInt();

        if (tamanho <= 1) {
            System.out.println("O vetor deve ter pelo menos dois elementos.");
            return;
        }

        /*
        array de inteiros chamado vetor com um tamanho específico,
        determinado pela variável tamanho.
         */
        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = teclado.nextInt();
        }

        int segundoMenor = encontrarSegundoMenor(vetor);

        System.out.println("O segundo menor elemento é: " + segundoMenor);
        teclado.close();
    }
    public static int encontrarSegundoMenor(int[] vetor) {
        // Ordena o vetor em ordem crescente
        Arrays.sort(vetor);

        // O segundo menor elemento estará na posição 1 do vetor ordenado
        return vetor[1];
    }
}