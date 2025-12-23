package array;

public class ArrayDi1 {

    static void main(String[] args) {
        // 2x3 2차워나 배열을 만든다
        int[][] arr = new int [2][3];   // 행2, 열3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int row = 0; row < 2; row++){


        // 0행 출력
        System.out.print(arr[row][0] + " ");
        System.out.print(arr[row][1] + " ");
        System.out.print(arr[row][2] + " ");
        System.out.println();
        }
    }
}
// 잠깐 출력 결과가 이해가 안됐었는데 이해했다
// for문을 사용해서 row라는 변수를 선언해줬고, row가 < 2 까지 돌면
// 0으로 한번 돌아서 row 값에 0 대입 후 증가 -> 1로 한번 더 돌아서 row 대입
// 증가 2 ' > ' 성립되지 않아서 for문 종료
// 그래서 출력결과에 줄바꿈이 됐다