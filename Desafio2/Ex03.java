/*
Elabore um programa que leia uma lista de palavras e retorne a 
palavra de maior comprimento
*/

package ex03;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
        
		List<String> lista = new ArrayList<>();
		
		lista.add("João");
		lista.add("Marcio");
		lista.add("Maria");
		lista.add("Ana");
		
		int tamanhoPalavra = 0;
		String maiorPalavra = null;
		
		for(String x : lista) {
			if(x.length() > tamanhoPalavra) {
				tamanhoPalavra = x.length();
				maiorPalavra = x;
				
			}
			
		}
		
		System.out.println("Palavra com maior comprimento: " + maiorPalavra);
    }
}
