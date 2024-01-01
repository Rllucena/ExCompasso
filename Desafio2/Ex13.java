/*
Elabore um programa que leia uma lista de números e exiba apenas 
os números que formam uma sequência crescente.
*/

package ex13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		List<Double> lista = new ArrayList<>();
		List<Double> listaSequencial = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a lista de números separados por espaço: ");
		String s = sc.nextLine();
		
		String[] vetor = s.split(" ");
		
		for(int i = 0; i < vetor.length; i++) {
			lista.add(Double.parseDouble(vetor[i]));
		}
		
		//inicia a lista sequencial com o menor valor possível
		listaSequencial.add(Double.MIN_VALUE);
		//percorre a lista de números
		for(int i = 1; i < lista.size(); i++) {
			//verifica se o número da posição atual é maior que o número na posição anterior e se ele é maior que o último número inserido na lista com a sequencia.
			if(lista.get(i) > lista.get(i-1) && lista.get(i) > listaSequencial.get(listaSequencial.size() - 1)) {
				listaSequencial.add(lista.get(i));
				if(listaSequencial.size() == 2) {
					//troca o menor valor possível adicionado anteriormente pelo primeiro valor que será usado na lista sequencial
					listaSequencial.remove(0);
					listaSequencial.add(0, lista.get(i-1));
				}
			}
		}
		
		System.out.println("Número da lista que formam uma sequência crescente: ");
		for(double i : listaSequencial) {
			System.out.println(i);
		}
		
		sc.close();
		
	}
}
