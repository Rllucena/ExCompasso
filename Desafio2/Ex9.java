//9. Implemente um programa que conte o número de anagramas de uma
//palavra em uma lista de palavras.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) throws Exception {

        List<String> lista = new ArrayList<>();
        int contAnagramas = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Palavra do anagrama: ");
        String anagrama = sc.nextLine();

        System.out.print("Quantas palavras serão escritas na lista: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<n; i++) {
            System.out.printf("Palavra %d: ", i);
            lista.add(sc.nextLine());
        }

        //verificar se existem anagramas
        for (int i=0; i<n; i++) {
            String palavra = lista.get(i).trim();//.trim remove espaços em branco ao final da string
            if (palavra.length() != anagrama.length()) {
                //não é anagrama
            } else {
                char[] p1 = palavra.toCharArray();
                char[] p2 = anagrama.toCharArray();

                Arrays.sort(p1);
                Arrays.sort(p2);

                if (Arrays.equals(p1, p2)) {
                    contAnagramas += 1;
                } else {
                    //não é anagrama
                }
            }
        }

        System.out.printf("Numeros de anagramas: %d", contAnagramas);

    }

    

}
