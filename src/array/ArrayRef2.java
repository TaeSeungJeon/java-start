package array;

public class ArrayRef2 {
    static void main(String[] args) {

        int[] students;         // 배열 변수 선언
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i <  students.length; i++) {  //students.length = 5와 같다 위에 인트 선언된 5
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}

// 배열 생성을 해놓음으로서 for문으로 length까지 이용해 코드를 더 깔끔하게 만들 수 있음.