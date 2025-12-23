package array;

// 구조 개선  - 초기화, 배열의 길이

public class ArrayDi3 {

    static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},    // 행
                {4, 5, 6},    // 열
                {7, 8, 9}
        };

        for(int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
// 1차원 배열, 2차원배열을 위와 같이 정리함으로서 코드가 깔끔해지고 간략해졌다.

// for 문에 row < '숫자' 를 지우고 length를 사용해서 만드는 코드 예제를 만들어 보았다.
// 두번째 for 문에서 arr[row].length는 row가 갖고있는 갯수만큼 가겠다 라는 뜻이다.