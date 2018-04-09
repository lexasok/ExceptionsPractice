import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        try {
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
