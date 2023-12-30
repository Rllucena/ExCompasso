import java.util.Scanner;

public class Ex15 {

    //funcao para imprimir um vetor
    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //metodo de ordenacao bublesort bem basico que acha o menor e joga pra primeira posicao, e o segundo menor pra segunda opcao... e etc
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean troca;

        do {
            troca = false;

            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    troca = true;
                }
            }
        } while (troca);
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        //inicio do bloco de try
        try {
            // Entrada do usuário
            System.out.println("Digite a lista de números separados por espaços: ");
            String input = in.nextLine();

            // Separa a lista recem recebida de uma string para um vetor
            String[] numerosStr = input.split(" ");

            int[] numeros = new int[numerosStr.length];

            // Preenche o vetor de numeros
            for (int i = 0; i < numerosStr.length; i++) {
                numeros[i] = Integer.parseInt(numerosStr[i]);
            }

            System.out.println("Antes da ordenação:");
            imprimirVetor(numeros);

            bubbleSort(numeros);

            System.out.println("Depois da ordenação:");
            imprimirVetor(numeros);

        } catch (NumberFormatException e) {
            System.out.println("Erro, digite apenas números.");
        } finally {
            in.close();
        }
    }
}