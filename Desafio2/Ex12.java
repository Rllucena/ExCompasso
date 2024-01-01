import java.util.Scanner;
    /*
    12.Crie um programa que verifique se uma string é um palíndromo, considerando apenas os caracteres alfabéticos.
    diz-se de ou frase ou palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa”: osso, Ana
     */
    public class Ex12 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite uma palavra para verificar se é um palíndromo:");
            String entrada = teclado.nextLine().replaceAll("[^a-zA-Z]", "");

            boolean isPalindromo = true;

            for (int i = 0, j = entrada.length() - 1; i < j; i++, j--) {
                if (entrada.charAt(i) != entrada.charAt(j)) {
                    isPalindromo = false;
                    break;
                    }
                }

                System.out.println(isPalindromo ? "É um palíndromo!" : "Não é um palíndromo.");
                teclado.close();
            }
        }