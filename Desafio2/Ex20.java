import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            // Entrada do usuario
            System.out.println("Digite um número não negativo: ");
            int numero = in.nextInt();

            if (numero >= 0) {
                // Calcula o quadrado
                int quadrado = numero * numero;

                // Converte o quadrado para uma string
                String strQuadrado = String.valueOf(quadrado);

                // Verifica todas as possíveis divisões do quadrado
                for (int i = 1; i < strQuadrado.length(); i++) {
                    String parte1Str = strQuadrado.substring(0, i);
                    String parte2Str = strQuadrado.substring(i);

                    // Converte as partes para inteiros
                    int parte1 = Integer.parseInt(parte1Str);
                    int parte2 = Integer.parseInt(parte2Str);

                    // Verifica se a divisão satisfaz a condição de Kaprekar
                    if (parte1 + parte2 == numero) {
                        System.out.println(numero + " é um número de Kaprekar.");
                        return;
                    }
                }

                System.out.println(numero + " não é um número de Kaprekar.");
            } else {
                System.out.println("Por favor, digite um número não negativo.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro, digite apenas números.");
        } 
        catch (InputMismatchException e) {
            System.out.println("Erro, digite apenas números.");
        }finally {
            in.close();
        }
    }
}