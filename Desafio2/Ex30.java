import java.util.Scanner;

public class Ex30 {

    public static boolean estRomani(String numeroRomano) {
        // Verifica se a string contém apenas caracteres validos
        if (!numeroRomano.matches("[IVXLCDM]+")) {
            System.out.println("Há caracteres que não fazem parte dos numerais romanos");
            return false;
        }


        // Verifica se não há mais de 3 caracteres iguais consecutivos
        if (numeroRomano.length()>3) {
            for (int i = 0; i < numeroRomano.length() - 3; i++) {
                char currentChar = numeroRomano.charAt(i);
                if (currentChar == numeroRomano.charAt(i + 1) && currentChar == numeroRomano.charAt(i + 2) && currentChar == numeroRomano.charAt(i + 3)) {
                    System.out.println("Há mais de 3 caracteres sequenciais");
                    return false;
            }
            }
        }

        // Verifica se há II imediatamente antes de V ou X
        for (int i = 0; i < numeroRomano.length() - 1; i++) {
            if (numeroRomano.substring(i, i + 2).equals("II")) {
                char nextChar = i + 2 < numeroRomano.length() ? numeroRomano.charAt(i + 2) : ' ';
                if (nextChar == 'V' || nextChar == 'X') {
                    System.out.println("Há II antes de V ou X");
                    return false;
                }
            }
        }

        // Verifica se não há XX antes de um L ou C
        for (int i = 0; i < numeroRomano.length() - 1; i++) {
            if (numeroRomano.substring(i, i + 2).equals("XX")) {
                char nextChar = i + 2 < numeroRomano.length() ? numeroRomano.charAt(i + 2) : ' ';
                if (nextChar == 'L' || nextChar == 'C') {
                    System.out.println("Há XX antes de um L ou C");
                    return false;
                }
            }
        }

        // Verifica se não há CC antes de um D ou M
        for (int i = 0; i < numeroRomano.length() - 1; i++) {
            if (numeroRomano.substring(i, i + 2).equals("CC")) {
                char nextChar = i + 2 < numeroRomano.length() ? numeroRomano.charAt(i + 2) : ' ';
                if (nextChar == 'D' || nextChar == 'M') {
                    System.out.println("Há CC antes de um D ou M");
                    return false;
                }
            }
        }

        // ordem correta dos caracteres romanos: MDCLXVI

        // Verifica se a string está em ordem correta
        for (int i = 0; i < numeroRomano.length() - 1; i++) {
            if (i == (numeroRomano.length() - 2)){
                return true;
            }

            if (numeroRomano.charAt(i)=='M'){
                if (numeroRomano.charAt(i+1)!='M' && i>2){
                    if (numeroRomano.charAt(i+2)=='M' && numeroRomano.charAt(i+1)!='C'){
                        System.out.println("Fora de ordem M");
                        return false;
                    }
                i++;
                }
            }
            if (numeroRomano.charAt(i)=='D'){
                if (numeroRomano.charAt(i+1)=='D'||numeroRomano.charAt(i+1)=='M'){
                        return false;
                }
            }
            if (numeroRomano.charAt(i)=='C'){
                if (numeroRomano.charAt(i+1)!='C' && i>2){
                    if (numeroRomano.charAt(i+2)=='C'&& numeroRomano.charAt(i+1)!='X'){
                        System.out.println("Fora de ordem C");
                        return false;
                    }
                i++;
                }
            }
            if (numeroRomano.charAt(i)=='L'){
                if (numeroRomano.charAt(i+1)=='L'||numeroRomano.charAt(i+1)=='M'||numeroRomano.charAt(i+1)=='D'||numeroRomano.charAt(i+1)=='C'){
                        System.out.println("Fora de ordem L");
                        return false;
                }
            }
            if (numeroRomano.charAt(i)=='X'){
                if (numeroRomano.charAt(i+1)!='X'){
                    if (numeroRomano.charAt(i+2)=='X' && numeroRomano.charAt(i+1)!='I'){
                        System.out.println("Fora de ordem X");
                        return false;
                    }
                i++;
                }
            }
            if (numeroRomano.charAt(i)=='V'){
                if (numeroRomano.charAt(i+1)=='V'||numeroRomano.charAt(i+1)=='L'||numeroRomano.charAt(i+1)=='M'||numeroRomano.charAt(i+1)=='D'||numeroRomano.charAt(i+1)=='C'){
                        System.out.println("Fora de ordem V");
                        return false;
                }
            }
            
        }

        //caso especial de dois X a frente de um I
        if(numeroRomano.length()>2){    
            if (numeroRomano.charAt(numeroRomano.length()-3)=='I' && numeroRomano.charAt(numeroRomano.length()-2)=='X' && numeroRomano.charAt(numeroRomano.length()-1)=='X'){
                System.out.println("Fora de ordem I");
                return false;
            }
        }    

        return true;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("Digite um numero romano menor que 4mil: ");
            String numeroRomano = in.nextLine().toUpperCase();

            if (estRomani(numeroRomano)) {
                System.out.println(numeroRomano + " é um número romano válido.");
            } else {
                System.out.println(numeroRomano + " não é um número romano válido.");
            }

            in.close();

    }
}