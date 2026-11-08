public class calculator {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int c, int d) {
        return c * d;
    }

    public static void main(String args[]) {
        System.out.println("Hello world");
        int add = sum(2, 3);
        System.out.println(add);
        int minus = sub(5, 3);
        System.out.println(minus);
        int multi = mul(4, 6);
        System.out.println(multi);
    }
}