import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCases = scan.nextInt();
        while (numCases-- > 0) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            Calculator calculator = new Calculator();
            try {
                System.out.println(Calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }
}

class Calculator {
    public static int power(int n, int p) throws Exception {
        if (n >= 0 && p >= 0) {
            return (int) Math.pow(n, p);
        } else throw new Exception("n and p should be non-negative");
    }
}
