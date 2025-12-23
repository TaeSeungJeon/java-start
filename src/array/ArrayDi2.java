package array;

public class ArrayDi2 {

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
            for (int column = 0; column < 3; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
// int row로 행을 선언해서 카운트하고
// column을 선언해서 상단에 arr에 보면 2까지 있으니까 < 3을 사용한다.

//