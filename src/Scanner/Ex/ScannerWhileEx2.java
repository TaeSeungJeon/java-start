package Scanner.Ex;

import java.util.Scanner;

//문 ) 사용자로부터 상품의 가격(price)과 수량(qty)을 입력받고 총 비용을 출력하는 프로그램 작성
//     가격과 수량을 입력받은 후에는 이들의 곱을 출력하세요. 출력 형태는 "총 비용: [곱한 결과]" 이어야함.
//      -1을 입력하여 입력종료 합니다.
public class ScannerWhileEx2 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = input.nextInt();

            if (price == - 1) {    //종료 조건 선언
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매 수량을 입력하세요: ");
            int qty = input.nextInt();

            int total = price * qty;
            System.out.println("총 비용: " + total);

        }
    }
}

// 정리
// 처음부터 안보고 문제를 풀어보았다.

// 17행을 건너뛰고 14행, 22행을 입력했다. (오답)

// 17행 if문을 통해 종료할 조건을 먼저 선언해준뒤 break를 거는 것에대해 다시 학습하게 됨 price가 -1과 == 같을 때 종료break

// 25행 total 이라는 문자를 어떻게 정할지 몰라서 못 풀었다..
// total로 정의하면 되는구나를 영상으로 보고 바로 정지후 price와 qty를 곱해서 출력시켰다 정답!

