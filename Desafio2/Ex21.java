/*
Desenvolva um programa que calcule a média harmônica ponderada 
de uma lista de números.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Ex21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanhoLista;
        int numero;
        int peso;
        double somaProdutos = 0.0;
        double somaPesos = 0.0;
        double mediaHarmonicaPonderada = 0.0;
        

        List<Integer> lista = new ArrayList<>();
        List<Integer> pesos = new ArrayList<>();

        System.out.println("Digite o tamanho da lista: ");
        tamanhoLista = scanner.nextInt();        


        //para consumir o \n
        scanner.nextLine();

        // montando a lista e os pesos
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println("Digite o numero da posicao " + (i));
            numero = scanner.nextInt();
            lista.add(numero);

            System.out.println("Digite o peso para o numero da posicao " + (i));
            peso = scanner.nextInt();
            pesos.add(peso);
        }

        // mostrando a lista
        System.out.println("Lista: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("posicao " + i + ": " + lista.get(i) + " , Peso: " + pesos.get(i));
        }

        // percorrendo a lista e calculando as variaveis somaProduto e somaPesos
        for (int i = 0; i < lista.size(); i++) {
            somaProdutos += pesos.get(i) / lista.get(i);
            somaPesos += pesos.get(i);
        }

        // calculando a media harmonica ponderada
        mediaHarmonicaPonderada = somaPesos / somaProdutos;

        System.out.println("Media harmonica ponderada: " + mediaHarmonicaPonderada);

        scanner.close();

    }
}