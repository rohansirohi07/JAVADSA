
import java.util.Scanner;

public class error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter the amount:");
            double amount = scanner.nextDouble();
            
            if (amount < 0) {
                throw new ArithmeticException("Amount cannot be negative");
            }
            
            System.out.println("You entered a valid amount: " + amount);
        } catch (ArithmeticException e) {
            System.err.println("Caught exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}