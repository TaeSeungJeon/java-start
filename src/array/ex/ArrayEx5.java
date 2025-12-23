package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();  // 몇개 받을건지

        int[] num = new int[count];
        int sum = 0;
        double avg;

        System.out.println(count + "개의 정수를 입력하세요.");
        for (int i = 0; i < count; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }
        avg = (double) sum / count;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}

// 11행 몇개 받을건지 작동시켜주는 작업 생각하지 못했음.. 오답

// 오늘은 여기까지 해보려고한다.
// 역시 아직 많이 멀었고 험난하다는 생각이든다...

// 배열에서부터 난이도, 코드 읽는방법들이 확 난이도가 올라간 것 같은 느낌이다.
// 지금부터 더 집중해서 반복 코드, 문제풀이, 복습 등
// 학습을 더 요구하는 단계라고 생각이 든다.

// 내일도 화이팅...!!!!!!