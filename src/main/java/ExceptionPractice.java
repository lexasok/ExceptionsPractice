public class ExceptionPractice {

    public static void main(String[] args) {
//        int[] intArray = new int[10];
//        System.out.println(intArray[10]);
//
        try {
            int[] c = new int[5];
            System.out.println(c[5]);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Exception thrown  " + e);
        }

    }
}
