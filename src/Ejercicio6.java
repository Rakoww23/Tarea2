import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a word");
        String word = sc.nextLine().toLowerCase();
        int count = 0;
        
       for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
         
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'|| letter == 'u')  {
            
            count++;
        }
    }
        System.out.println("The vocals amount is " + count);


    }
}
