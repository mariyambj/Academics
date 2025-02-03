import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = scan.nextInt();
        int fact = findFactorial(num1);
        System.out.println("The factorial is: " + fact);
        scan.close();
    }
}
