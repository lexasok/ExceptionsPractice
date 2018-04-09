import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        try(Scanner scan = new Scanner(System.in)) {
            System.out.println(Integer.parseInt(scan.nextLine()));
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
