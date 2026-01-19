import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write any sentence");
        String sentence = sc.nextLine();

        System.out.println("Write any word");
        String word = sc.nextLine();

        if (sentence.contains(word)) {
            System.out.println("The word " + word + " is contained in the sentence");
        }else{
            System.out.println("The word " + word + " isn't contained in the sentence");
        }

    }
}
