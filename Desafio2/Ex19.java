// 19.Implemente um programa que conte o número de caracteres não
// alfabéticos em uma string.

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int cont =0;

        System.out.print("Digite algo: ");
        String p = sc.nextLine();


        for (int i=0; i<p.length(); i++) {
            char letra  = p.charAt(i);

            if (!Character.isAlphabetic(letra)) {
                cont++;
            }
        }

        System.out.printf("Caracteres não alfabéticos: %d", cont);


    }
}
