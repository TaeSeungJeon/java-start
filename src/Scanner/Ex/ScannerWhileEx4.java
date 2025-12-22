package Scanner.Ex;

/*
문제 - 상품 구매
        사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세요.
        사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
        사용자에게 다음 세 가지 옵션을 제공해야 합니다: 1: 상품 입력, 2: 결제, 3: 프로그램 종료.
        옵션은 정수로 입력받으며, 옵션을 저장하는 변수의 이름은 `option` 이어야 합니다.
        상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
        결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 `0` 으로 초기화하세요.
        (사용자가 총 비용을 확인하고, 결제를 완료했다고 가정합니다.
        따라서 다음 사용자를 위해 총 비용을 다시 `0` 으로 초기화 해야합니다.)
        프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료하세요.
        위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력하세요.
*/

import java.util.Scanner;

public class ScannerWhileEx4 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine();
                System.out.print("상품명을 입력하세요: ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int qty = input.nextInt();

                totalCost += price * qty;
                System.out.println("상품명: " + product + "가격: " + price + "수량: " + qty + "합계: " + price * qty);

            }else if (option == 2) {
                System.out.print("총 비용: " + totalCost);
                totalCost = 0;

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요. ");
            }
        }
    }
}


// 정리

// 해당코드는 문제 풀이와함께 작성하면서 학습해봤다
// 솔직히 많이 어려웠다.
// 코드를 보면서 이해해보겠다

// 먼저 스캐너를 만들어주고, 합계를 먼저 선언해준다 출력할 내용을 입력한다 이때 문장이 입력될 곳이면 String 숫자는 int double,... 사용 주의

// 총 구매금액을 계산하는 totalprice를 만들어주고
// if else if 를 통해 입력받을 숫자에 맞는 조건들을 만들어준다 해당 숫자를 입력했을 때 무엇을 출력해줄 것 인지...
