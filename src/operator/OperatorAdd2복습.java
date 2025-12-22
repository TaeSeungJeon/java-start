package operator;

public class OperatorAdd2복습 {

    static void main(String[] args) {

        int a = 1;
        int b = 0;

        a = a + 1;
        System.out.println("a = " + a);

        a = a++;
        System.out.println("a = " + a);

        a = ++a;
        System.out.println("a = " + a);

        a = ++a;
        System.out.println("a = " + a);

        a = b + 1;
        System.out.println("a = " + a);

        a = ++b;
        System.out.println("b = " + b);

        b = ++b;
        System.out.println("b = " + b);

        b = ++b;
        System.out.println("b = " + b);

        b = b++;
        System.out.println("b = " + b);

    }
}
