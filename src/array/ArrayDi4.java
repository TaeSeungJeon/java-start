package array;

// 구조 개선  - 초기화, 배열의 길이

public class ArrayDi4 {

    static void main(String[] args) {

        int[][] arr = new int[4][4];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
               arr[row][column] = i++;

                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }

}

// 코드를 축약하는데 좀 복잡하긴 했다
// 일단 두번째 for 문 arr[row].length 부분에서 살짝 헤맸었고
// 다음 행 arr [row][column] 을 i = 1로 선언해 줌으로서 증가시키는 코드가 추가됐다

// int를 선언하는 과정을 생각하지 못했었는데 이 과정을 통해 int i = 1을 선언해주고
// arr[row][column]을 지나가면서 각각 1씩 증가시키는 코드를 만든것이다
// 그 변수를 활용하는 방법을 알게되었다.

// 완전히 익숙해 지기까진 반복 학습이 약간 필요할 것 같다.
