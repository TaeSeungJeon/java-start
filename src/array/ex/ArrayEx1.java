package array.ex;

public class ArrayEx1 {
    static void main(String[] args) {

       int student1 = 90;
       int student2 = 80;
       int student3 = 70;
       int student4 = 60;
       int student5 = 50;


        int total = student1 + student2 + student3 + student4 + student5;
        double avg = (double) total / 5;
        System.out.println("점수 총 합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}


// 해당 예제를 for 문을 사용해서 풀이하는 문제 -> Array1Ref