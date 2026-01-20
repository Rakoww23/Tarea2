import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Write the sentence");
        String sentence = sc.nextLine();

        String capitalSentence = sentence.toUpperCase();
        String lowerCaseSentence = sentence.toLowerCase();

        System.out.println(sentence);
        System.out.println(capitalSentence);
        System.out.println(lowerCaseSentence);
        

    }

}
