package Scope;

public class Scope2 {
    static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        }
        // 출력 안됨 System.out.println("main m = " + i);
        System.out.println("main m = " + m);
    }
}
