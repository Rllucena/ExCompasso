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
        double somaInversos = 0.0;
        double mediaHarmonicaPonderada = 0.0;
        

        List<Integer> lista = new ArrayList<>();

        System.out.println("Digite o tamanho da lista: ");
        tamanhoLista = scanner.nextInt();        


        //para consumir o \n
        scanner.nextLine();

        // montando a lista
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println("Digite o numero da posicao " + (i));
            numero = scanner.nextInt();
            lista.add(numero);
        }

        // mostrando a lista
        System.out.println("Lista: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("posicao " + i + ": " + lista.get(i));
        }

        // calculando a media harmonica ponderada
        for (int i = 0; i < lista.size(); i++) {
            somaInversos += 1.0 / lista.get(i);
        }

        mediaHarmonicaPonderada = tamanhoLista / somaInversos;

        System.out.println("Media harmonica ponderada: " + mediaHarmonicaPonderada);



    }
}