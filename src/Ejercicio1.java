import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a characters amount");
        String characters = sc.nextLine();

        int amount = characters.length();

        System.out.println("The characters amount is: " + amount);

    }
}
