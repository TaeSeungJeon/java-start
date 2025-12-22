package Scope;

public class Scope1 {
    static void main(String[] args) {
        int m = 10;    //m생존시작

        if (true) {
            int x = 20;    //x생존시작
            System.out.println("if m = " + m);
            System.out.println("if m = " + x);
        }   // x 생존 종료
        // System.out.println("mian x = " + x); 출력 안됨
        System.out.println("mian x = " + m);
    }
}
