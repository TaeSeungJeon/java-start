package array;

import javax.crypto.spec.PSource;

public class ArrayDi0 {

    static void main(String[] args) {
        // 2x3 2차워나 배열을 만든다
        int[][] arr = new int [2][3];   // 행2, 열3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        // 0행 출력
        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.print(arr[0][2] + " ");
        System.out.println(); // 한 행 끝나고 라인 변경해줌
        // 1행
        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");
        System.out.println();

    }
}
// 다음시간에 리펙토링