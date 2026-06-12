package NumberAnalyzerApplication;

import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("\nNumber is Positive");
        } else if (number < 0) {
            System.out.println("\nNumber is Negative");
        } else {
            System.out.println("\nNumber is Zero");
        }

        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }
        }

        sc.close();
    }
}
