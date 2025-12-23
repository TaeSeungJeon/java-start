package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("정수입력이 끝났습니다. 출력 결과는: ");

        for (int i = 4; i >= 0; i--) {      // 역순으로 바꾸는 코드
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
// Array Ex2의 코드를 역순으로 나오게 하는 코드를 해보았다.
// 앞에 int 선언 조건을 바꿨기 때문에 length부분을 i>=0 으로 수정, i-- 감소로 수정
// 과정을 거친 뒤 if문도 함께 수정해주었다.

// 15행을 내 임의로 ln을 빼고 멘트를 바꿔서 정수입력이 끝났다는 안내문구와 함께
// 출력 결과를 정렬해서 보여주도록 만들어보았다.