import java.util.Scanner;

public class Ejericio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a word");
        String word = sc.nextLine();

        for (int i = word.length()-1; i >= 0; i--) {
            char inverted = word.charAt(i);
            System.out.print(inverted);
        }

        
    }
}
