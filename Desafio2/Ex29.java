// 29.Implemente um programa que calcule a média ponderada de uma lista de números.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Double> listaNotas = new ArrayList<>();
        List<Double> listaPesos = new ArrayList<>();
        Double dividendo=0.0, divisor=0.0, media;

        System.out.print("Quantas notas serão inseridas? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("Insira a nota: ");
            listaNotas.add(sc.nextDouble());
            System.out.print("Insira o peso dessa nota: ");
            listaPesos.add(sc.nextDouble());
        }

        for (int i=0; i<listaNotas.size(); i++) {
            //calcula o dividendo para o calculo da média (soma dos produtos das notas pelos seus respectivos pesos)
            dividendo += listaNotas.get(i) * listaPesos.get(i);
            //calcula o divisor (soma dos pesos)
            divisor += listaPesos.get(i);
        }

        media = dividendo/divisor;

        System.out.printf("Média: %.2f", media);
        sc.close();

    }
}

