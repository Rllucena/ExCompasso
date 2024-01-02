//24.Implemente um programa que determine se um número é primo de Mersenne.
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número natural para verificar se é primo de Mersenne: ");
        int numero = sc.nextInt();
        int expoente = 1;

        //enquanto o resultado da operação de Mersenne for menor ou igual ao numero que esta sendo testado...
        while (Math.pow(2, expoente) - 1 <= numero) {
            //...verifica se o novo resultado da expressão é igual ao numero a ser testado
            if ((Math.pow(2, expoente) - 1) == numero) {
                System.out.println(numero + " é um número primo de Mersenne: 2^" + expoente + " - 1");
                sc.close();
                return;//se verdadeiro o programa é encerrado nesta linha
            }
            expoente++;//acrescenta 1 ao exponte para novo resultado da expressão de Mersenne 
        }

        System.out.println(numero + " não é um número primo de Mersenne.");
        sc.close();
    }
}
