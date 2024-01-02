// 4. Implemente um programa que determine se uma string é um número válido (inteiro ou decimal).

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        String strNum = sc.nextLine();

        try {
            Double.parseDouble(strNum);
            System.out.println("É um número válido.");
        } catch (NumberFormatException e) {//caso ocorra esta exceção ela é tratada com o seguinte print...
            System.out.println("Não é um número válido.");
        }
        sc.close();
    }
}
