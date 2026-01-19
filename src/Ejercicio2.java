import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

     System.out.println("Write any word");
     String word = sc.nextLine();
        
     char first = word.charAt(0);
     char last = word.charAt(word.length() - 1);

     System.out.println("The first character is " + first);

     System.out.println("The last character is " + last);
    }

   
    

}
