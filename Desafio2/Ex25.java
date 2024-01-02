//Escreva um programa que conte o número de elementos em comum entre dois vetores
import java.util.Scanner;


public class Ex25 {

    // Funcao para imprimir um vetor de palavras
    public static void imprimirVetor(String[] vetor) {
        for (String palavra : vetor) {
            System.out.print(palavra + " ");
        }
        System.out.println();
    }

    // Funcao para contar palavras em comum entre dois vetores
    public static int contarElementosComuns(String[] vetor1, String[] vetor2) {
        int count = 0;

        // Marca as palavras do primeiro vetor como contadas
        boolean[] visitadas = new boolean[vetor1.length];

        for (String palavra2 : vetor2) {
            for (int i = 0; i < vetor1.length; i++) {
                if (!visitadas[i] && palavra2.equals(vetor1[i])) {
                    // Conta quando encontra uma palavra em comum
                    count++;
                    visitadas[i] = true;
                    break;  // Sai do loop interno apos encontrar a palavra
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            // Entrada do usuário para o primeiro vetor
            System.out.println("Digite o primeiro vetor separado por espaços: ");
            String input1 = in.nextLine();
            String[] palavras1 = input1.split(" ");

            // Entrada do usuário para o segundo vetor
            System.out.println("Digite o segundo vetor separado por espaços: ");
            String input2 = in.nextLine();
            String[] palavras2 = input2.split(" ");

            System.out.println("Vetores originais:");
            imprimirVetor(palavras1);
            imprimirVetor(palavras2);

            int elementosComuns = contarElementosComuns(palavras1, palavras2);

            System.out.println("Número de elementos em comum: " + elementosComuns);

         
            in.close();
        
    }
}