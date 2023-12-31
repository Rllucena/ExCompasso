/*
Elabore um programa que leia uma lista de números e exiba apenas 
os números que formam uma sequência crescente.
*/

package ex13;

import java.util.ArrayList;
import java.util.List;

public class Ex13 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		List<Integer> listaSequencial = new ArrayList<>();
		
		lista.add(2);
		lista.add(5);
		lista.add(5);
		lista.add(7);
		lista.add(6);
		lista.add(8);
		lista.add(3);
		
		//inicia a lista sequencial com o menor valor possível
		listaSequencial.add(Integer.MIN_VALUE);
		//percorre a lista de números
		for(int i = 1; i < lista.size(); i++) {
			//verifica se o número da posição atual é maior que o número na posição anterior e se ele é maior que o último número da lista com a sequencia.
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
		for(int i : listaSequencial) {
			System.out.println(i);
		}
	}

}
