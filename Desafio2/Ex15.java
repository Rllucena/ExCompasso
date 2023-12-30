import java.util.Scanner;

public class Ex15 {

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;

        do {
            trocou = false;

            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a lista de números separados por espaços: ");
        String input = in.nextLine();
        String[] numerosStr = input.split(" ");

        int[] numeros = new int[numerosStr.length];

        // Preenche o array de números
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }

        System.out.println("Array antes da ordenação:");
        imprimirArray(numeros);

        bubbleSort(numeros);

        System.out.println("Array após a ordenação:");
        imprimirArray(numeros);

        in.close();
    }
}