/*
Desenvolva um programa que calcule o cosseno de um ângulo em
graus.
 */


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double anguloGraus;
        double anguloRadianos;
        double anguloCosseno;

        System.out.println("Digite o angulo em graus:");
        anguloGraus = scanner.nextDouble();

        //convertendo para radianos
        anguloRadianos = Math.toRadians(anguloGraus);

        anguloCosseno = Math.cos(anguloRadianos);

        //arredondando
        //System.out.println("o cosseno do angulo é: " + String.format("%.2f", anguloCosseno));

        System.out.println("o cosseno do angulo é: " + anguloCosseno);

        scanner.close();

    }
}