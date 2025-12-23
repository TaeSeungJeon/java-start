package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
// 코드를 읽고 이해는 했는데 막힌 곳이 한 곳 있었다.
// 출력에 있어서 ',' 를 다듬기 위해 if문을 사용해서 다듬는 코드였는데
// 5 - 1은 4인데 뭐지.... 하고 생각하다가 < 기호를 보고 눈치를 챘다
// 4보다 작을 때 멈추기 때문이었다