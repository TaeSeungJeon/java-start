package array;

public class EnhancedFor1 {
    static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // 향상된 for 문
        for (int num : numbers) {
            System.out.println(num);

        // for (int number : numbers) {}  - 단축키 iter


        /*for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }*/

        // 향상된 for 문

        }
    }
}

// 기존 for 문에는 눈으로 하나하나 보여지기는 좋으나 복잡한 코드를 정리하기위해
// 향상된 for문을 사용하는 것이다

// 향상된 for 문에서 int 옆에 num을 이해하지 못했다
// 저 num은 왜 쓰여져 있는걸까..

// 답 : numbers 라는 항아리안에 1~5까지 담겨있는데
//      for 문을 돌기위해서 시작하는 숫자인 1을 임시로 num에 넣어두고
//      돌아와서 다음 숫자인 2를 임시 넣어두고를 반복하는 동작을 한다.
//      루프 끝에서 5를 만나 종료되는 코드이다