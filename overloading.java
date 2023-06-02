public class overloading {
    public static void main(String[] args) {

        int a = 5;
        double b = 10.2;

        System.out.println(doubleTheValue(a));
        System.out.println(doubleTheValue(b));

    }

    public static int doubleTheValue(int a) {
        return a*2;
    }

    public static double doubleTheValue(double b) {
        return b*2;
    }
}
