package Scanner.Ex;

//  문제 - 입력한 숫자의 합계와 평균
//  사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하세요. 사용자
//  는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정합니다.
//  모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 `sum` 과 평균 `average` 를 출력하세요. 평균은 소수점 아래까지
//  계산해야 합니다.
//  다음 실행 결과 예시를 참고해주세요.

//          숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:
//          1
//          2
//          3
//          4
//          -1
//          입력한 숫자들의 합계: 10
//          입력한 숫자들의 평균: 2.5

import java.util.Scanner;

public class ScannerWhileEx3 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 프로그램을 종료하려면 -1을 입력하세요: ");

 /*       while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }*/

        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 합계: " + avg);
    }
}

// 정리

/* 위 본문 주석 안쪽 내용이다

 int sum, count, input 을 선언 할 생각을 못했다 그래서 혼자 빙빙 돌고있었다. 오답

 while문 작성이 좀 헷갈렸다 input은 -1일때 종료되게 만드는코드는 이해했고
 sum += input에 count를 하는 코드가 생각하지 못했었다. 선언된 count를 사용해 ++ 증감시킨 값을
 avg 를 통해 평균치를 뽑아낸 코드이다

 39행 에 sum과 count는 모두 처음에 int로 선언됐었기 때문에 평균값에 소수점을 반환하지 못한다
 그래서 (double)을 넣어줌으로서 형변환을 시켜준다.*/


// 주석 하단은 다른 예제

// scanner로 1이 들어와 input에 대입되면 1 != -1 라고 적용되면서 작동하는 원리
// input에 1,2,3 ... 을 입력하면 루프가 돌다가 -1을 입력하면 -1과 -1이 만나 종료됨
