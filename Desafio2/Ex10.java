
import java.util.Scanner;



public class palindromas {
 

    public static boolean palindromasMutuas (String s1,String s2 ){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase(); 
        
        String s1inv="";


            for (int i = s1.length()-1; i >= 0; i--){
                s1inv = s1inv+s1.charAt(i);

            }

        
        if(s2.compareTo(s1inv)==0) {
            
            return true;
        }    
        
        return false;

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1,s2;
        
        System.out.println("Digite a primeira palavra: ");
        s1 = in.next();

        System.out.println("Digite a segunda palavra: ");
        s2 = in.next();
        
        if(palindromasMutuas(s1, s2)) System.out.println("São palíndromas mutuas");
        else System.out.println("Não são palíndromas mutuas");

        in.close();
    }


}
