package array;

public class ArrayRef4 {
    static void main(String[] args) {

        int[] students = {90, 80, 70, 60, 50, 40, 30};  /*new int[] 없어도 가능*/

        for (int i = 0; i <  students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }  // length 들어가있어서 {} 안의 내용을 줄이거나 늘릴 수 있다
    }
}

// ArrayRef 1번 을 보고 ~4번까지 축약하는 과정들의 최종본이다
// 이해 완료 했고, 아마 문제로 나오면 풀 수 있을 정도이다.