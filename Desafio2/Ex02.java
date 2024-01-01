import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {

        /* 2. Elabore um programa que leia uma lista de palavras
        e retorne a palavra com o menor número de caracteres.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as palavras (digite 'fim' para encerrar):");

        String menorPalavra = null;

        while (true) {
            System.out.print("Digite uma palavra: ");
            String entrada = scanner.next();

            if (entrada.equals("fim")) {
                break; // Encerra o loop se o usuário digitar 'fim'
            }
            /*
             matches é um método,[a-zA-Z]+ é usada para verificar se uma string contém
             apenas letras do alfabeto (maiúsculas ou minúsculas).
             */
            if (entrada.matches("[a-zA-Z]+")) {
                if (menorPalavra == null || entrada.length() < menorPalavra.length()) {
                    menorPalavra = entrada;
                }
            } else {
                System.out.println("Erro: Digite apenas palavras.");
            }
        }
        if (menorPalavra != null) {
            System.out.println("A palavra com o menor número de caracteres é: " + menorPalavra);
        } else {
            System.out.println("Nenhuma palavra fornecida.");
        }
        scanner.close();
    }
}