//Implemente um programa que determine se uma string é um palíndromo, considerando apenas os caracteres alfanuméricos

import java.util.Scanner;



public class Ex10 {
 

    public static boolean palindromas (String s1){
        //coloca a string s1 em minuscula, limpa caracteres especiais e cria uma string para receber o inverso de s1
        s1 = s1.toLowerCase().replaceAll("[^a-z ]", "");
        String s1inv="";

            //coloca a ultima letra de s1 na primeira posiçao de s1inv até inverter a palavra
            for (int i = s1.length()-1; i >= 0; i--){
                s1inv = s1inv+s1.charAt(i);
            }
        
        //compara o inverso de s1 com s1inv, se for igual, é palindromo    
        if(s1.compareTo(s1inv)==0) {
            return true;
        }    
        
        return false;

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1;
        
        System.out.println("Digite a palavra: ");
        s1 = in.next();

        if(palindromas(s1)) System.out.println("é palíndroma");
        else System.out.println("Não é palíndroma");

        in.close();
    }


}
