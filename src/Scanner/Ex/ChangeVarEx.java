package Scanner.Ex;

import org.w3c.dom.ls.LSOutput;

public class ChangeVarEx {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

                     //시작: 코드를 작성하세요
        temp = a;    // 10
        a = b;
        b = temp;
                    //종료: 코드를 작성하세요

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
// temp : a 의 값을 어딘가에 보관해 두어야 하는데 그 때 임시로 사용할 변수인 temp에 보관시킨다
