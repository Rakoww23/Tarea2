import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the first word");
        String first = sc.nextLine();

        System.out.println("Type the second word");
        String second = sc.nextLine();

        if (first.equalsIgnoreCase(second)) {
            System.out.println("Both words are the same");
        }else{
            System.out.println("Both words aren't the same");
        }

    }
}
