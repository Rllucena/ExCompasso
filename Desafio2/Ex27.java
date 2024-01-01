import java.util.Scanner;
/*
27.Crie um programa que remova os espaços em branco extras de uma string.
 */
public class Ex27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita ao usuário inserir uma palavra com espaços extras
        System.out.print("Digite uma palavra: ");
        String entrada = teclado.nextLine();

        // Remove espaços extras e exibe o resultado
        String resultado = removerEspacos(entrada);
        System.out.println("Palavra sem espaços extras: " + resultado);

        teclado.close();
    }

    // Função para remover todos os espaços de uma string
    public static String removerEspacos(String str) {
        /*
         a expressão regular \\s = para substituir todos os espaços por nada

         Método: replaceAll é usado para substituir todas as ocorrências
         de uma expressão regular em uma string por outra string.
         */
        return str.replaceAll("\\s", "");
    }
}