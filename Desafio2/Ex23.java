/*
Elabore um programa que leia uma lista de números e retorne o 
produto dos números negativos.
 */
package ex23;

import java.util.ArrayList;
import java.util.List;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(5);
		lista.add(-5);
		lista.add(-8);
		lista.add(4);
		lista.add(-2);
		
		int produto = 1;
		
		for(int i : lista) {
			if(i < 0) {
				produto *= i;
			}
		}
		
		System.out.println(produto);
	}

}
