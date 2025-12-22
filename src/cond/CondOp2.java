package cond;

public class CondOp2 {

    static void main(String[] args) {

        int age = 16;
        String status = (age >= 18)? "성인" : "미성년자";         // 삼항 연산자 코드가 깔끔하다

        System.out.println("age =" + age + " status = " + status);
    }
}
