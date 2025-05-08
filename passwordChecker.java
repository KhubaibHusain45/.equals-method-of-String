package passwordChecker;

import java.util.Objects;
import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        String password = "KhubaibHusain";

        Scanner input = new Scanner(System.in);
        String pass;

        do {
            System.out.print("Enter your password: ");
            pass = input.nextLine();
            if (!password.equals(pass)) {
                System.out.println("Access Denied");
            } else {
                System.out.println("Access Granted");
            }

        } while (!pass.equals(password));
    }

}
