package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        double avg;

        System.out.println("5개의 정수를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }
        avg = (double) sum / 5;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}

// 해당 문제는 좀 어려웠다
// 출력 값 예제를 보고 풀어보는 문제였는데

// int sum 선언 안함. double avg 선언 안함. 오답
// for문 끝에 sum += num[1]; 에서 해답 못찾아 냄. 오답
// 마지막 평균 구하고 출력하는부분 바로 이해했음 . 부족

// 전반적으로 써놓은 코드를 보면 하나씩 이해할 수 있지만
// 코드 만들기가 이 구절에서부터 난이도가 생기는게 느껴지는 구간이었다.