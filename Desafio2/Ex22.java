/*
22.Crie um programa que verifique se uma string é um acrônimo
Siglas são formadas pelas letras iniciais de outras palavras.
Quando uma sigla pode ser lida como uma nova palavra, e não
necessariamente letra a letra, pode ser chamada também de acrônimo.
Como exemplo: UNESCO e ACNUR são acrônimos, ao passo que IBGE e CNPJ
não o são.

exemplos de uso:
PDF = acrônimo
HTML = acrônimo
OpenAI = nao e acrônimo
AI = acrônimo
Java = nao e acrônimo
 */
import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma possível sigla ou acrônimo: ");
        String input = scanner.nextLine();

        // Verifica se é um acrônimo e exibe o resultado
        if (verificarAcronimo(input)) {
            System.out.println("É um acrônimo!");
        } else {
            System.out.println("Não é um acrônimo.");
        }
        scanner.close();
    }

    // Função para verificar se uma string é um acrônimo
    public static boolean verificarAcronimo(String str) {
        // Verifica se a string contém apenas letras maiúsculas, sem espaços, e pelo menos duas letras
        /*
        Regex, ou expressões regulares, é uma sequência de caracteres que define um padrão de busca.
        +: Indica que deve haver pelo menos um caractere maiúsculo, mas pode haver mais.
         */
        return str.matches("[A-Z]+") && str.length() >= 2;
    }
}
