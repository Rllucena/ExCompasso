/*
Elabore um programa que leia uma lista de palavras e retorne a 
palavra de maior comprimento
*/

package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
        
		String palavras;
		
		List<String> lista = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a lista de palavras separadas por espaço: ");
		palavras = sc.nextLine();
		String[] vetorPalavras = palavras.split(" ");
		
		for(int i = 0; i < vetorPalavras.length; i++) {
			lista.add(vetorPalavras[i]);
		}
		
		int tamanhoPalavra = 0;
		String maiorPalavra = null;
		
		for(String s : lista) {
			if(s.length() > tamanhoPalavra) {
				tamanhoPalavra = s.length();
				maiorPalavra = s;
				
			}
			
		}
		
		System.out.println("Palavra com maior comprimento: " + maiorPalavra);
		
		sc.close();
    }
}
