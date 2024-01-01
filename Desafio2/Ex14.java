// 14.Implemente um programa que calcule a média ponderada de três notas com pesos diferentes.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite 3 notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        System.out.print("Digite o pesso das notas respectivamente: ");
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();

        double notaFinal = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);

        System.out.printf("Média ponderada final: %f", notaFinal);

        sc.close();
    }
}
