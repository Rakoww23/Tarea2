import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a password");
        String password = sc.nextLine();

        boolean capital = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);
                if (character >= 'A' && character <= 'Z') {
                    capital = true;
                }
            }
        }

        if (password.length() >= 8 && capital) {
            System.out.println("The password is valid");
        }else{
            System.out.println("The password isn't valid");
        }

    }
}
