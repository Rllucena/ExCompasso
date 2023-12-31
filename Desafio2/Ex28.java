/*
Elabore um programa que verifique se uma lista de números é uma 
permutação de outra lista.
*/
package ex28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex28 {

	public static void main(String[] args) {
		
		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		
		lista1.add(5);
		lista1.add(1);
		lista1.add(9);
		lista1.add(8);
		
		lista2.add(8);
		lista2.add(5);
		lista2.add(1);
		lista2.add(9);
		
		if(lista1.size() == lista2.size()) {
			//método sort para ordenar as listas
			Collections.sort(lista1);
			Collections.sort(lista2);

			if(lista1.equals(lista2)) {
				System.out.println("As listas são permuções uma da outra!");
			}else {
				System.out.println("As listas não são permuções uma da outra!");
			}
		}
	}
}