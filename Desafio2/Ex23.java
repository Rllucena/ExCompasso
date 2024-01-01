/*
Elabore um programa que leia uma lista de números e retorne o 
produto dos números negativos.
 */
package ex23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		List<Double> lista = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a lista de números separados por espaço: ");
		String s = sc.nextLine();
		
		String[] vetor = s.split(" ");
		
		for(int i = 0; i < vetor.length; i++) {
			lista.add(Double.parseDouble(vetor[i]));
		}
					
		
		double produto = 1;
		
		for(double d : lista) {
			if(d < 0) {
				produto *= d;
			}
		}
		
		System.out.println(produto);
		
		sc.close();
	}

}
