package Scanner.Ex;

import java.util.Scanner;

public class ScannerEx5 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

                            // num1이 num2보다 큰경우 두 숫자를 교환
        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;

        }
        System.out.println("두 숫자 사이의 모든 정수: ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }
    }
}
// 되짚기 및 풀이 설명해보기

// 24) 5부터 돌기시작해서 7까지 돌아서 8이되면 빠져나감
// 27) i != num2 가 없었으면 출력이 5,6,7, 이되어서 !=를 활용해서 마지막 , 를 없애준다

// 첫 번째 입력한 숫자와 두번째 입력한 숫자 사이의 정수를 나타내는코드
// if문으로 만약 넘1이 넘2보다 클경우라는 경우를 선언해준 뒤
// int temp = num1 로 지정해주면 임시로 num1을 저장한뒤 num2를 꺼낼 수 있게 해주는 것 이다
// 그래서 첫번째 입력한 수와 두 번째 입력한 수의 순서와 상관없이 두 숫자 사이의 정수를 출력한다.
// 24 행에서 for문을 사용해 int i가 num1 이라 선언한뒤 i 는 num2보다 작거나 같을때까지 증가시킨다
// 26 행이 없으면 출력결과에 마지막에 ,가 찍히기 때문에 깔끔하게 다듬기위해 num2와 같지않을때 출력하지 않게 했다.