import java.util.Scanner;

public class Ex30 {

    public static boolean estRomani(String numeroRomano) {
        // Verifica se a string contém apenas caracteres validos
        if (!numeroRomano.matches("[IVXLCDM]+")) {
            System.out.println("Há caracteres que não fazem partes dos numerais romanos");
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

        // Verifica se não há mais de tres caracter de subtração (por exemplo, 'IV')
        if (numeroRomano.matches(".*[IXC]\\3.*")) {
            return false;
        }


        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("Digite um numero romano: ");
            String numeroRomano = in.nextLine().toUpperCase();

            if (estRomani(numeroRomano)) {
                System.out.println(numeroRomano + " é um número romano válido.");
            } else {
                System.out.println(numeroRomano + " não é um número romano válido.");
            }

            in.close();

    }
}