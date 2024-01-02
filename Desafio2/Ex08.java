
//Elabore um programa que converta um número decimal para binário.



public class Ex08 {

	public static void main(String[] args) {
		
		double decimal = 10;
		String s = Double.toString(decimal);
        
        s = s.replace('.', ' ');
        String[] vetor = s.split(" ");
       		
        int numAntesPonto = Integer.parseInt(vetor[0]);
        int numDepoisPonto = Integer.parseInt(vetor[1]);
        
        System.out.print("Número " + decimal + " em binario: " + Integer.toBinaryString(numAntesPonto) + "." + Integer.toBinaryString(numDepoisPonto));
	}

}
