package array.ex;

public class ArrayEx1Ref {
    static void main(String[] args) {

        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            //for (int student = students){
            total += students[i];
        }
        double avg = (double)total / 5;
        System.out.println("점수 총 합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}


// 이 경우에도 향상된 for 문으로 바꿀 수 있다

// 더블타입이 예제에 들어가있어서 큰 어려움은 없었다
// 만약 더블타입이 예제에 없었으면 생각을 좀 더 했을 것 같다.