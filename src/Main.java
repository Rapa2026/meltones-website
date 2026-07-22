public class Main {
    public static void main(String[] args) {
        System.out.println("first line");
        System.out.print("second line");
        System.out.println("still same line");

        try {
            int x = 10 / 0;
            System.out.println(x);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero, steel dwc");
        }

        System.out.println("Program survived");
    }
}