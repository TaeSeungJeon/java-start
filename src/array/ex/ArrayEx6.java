package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNum, maxNum;

        System.out.print(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNum = maxNum = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < maxNum) {
                minNum = numbers[i];
            }if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }

        System.out.println("가장 작은 점수: " + minNum);
        System.out.println("가장 큰 점수: " + maxNum);
    }
}
