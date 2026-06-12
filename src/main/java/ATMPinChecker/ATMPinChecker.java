package ATMPinChecker;
import java.util.Scanner;


public class ATMPinChecker {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int storedPin = 1234;
            int attempts = 3;
            int enteredPin;

            while (attempts > 0) {

                System.out.print("Enter ATM PIN: ");
                enteredPin = sc.nextInt();

                if (enteredPin == storedPin) {
                    System.out.println("Login Successful");
                    System.out.println("Welcome to ATM Services");
                    break;
                } else {
                    attempts--;

                    if (attempts > 0) {
                        System.out.println("Invalid PIN. Attempts Remaining: " + attempts);
                        System.out.println();
                    } else {
                        System.out.println("Invalid PIN");
                        System.out.println("\nCard Blocked. Please contact the bank.");
                    }
                }
            }

            sc.close();
        }

}
