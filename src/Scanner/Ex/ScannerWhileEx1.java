package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("입력한 이름: " + name + "입력한 나이: " + age);
        }
    }
}

// 정리
// Scanner scanner 라고 해놓고 String name = input 이라고 코드했음 틀림!
// -> Scanner input 으로 스캐너 만들었어야함 > 수정

// 21행 ) nextLine이 없으면 이름 - 나이 스캔 한 뒤에도 계속 나이만 물어보는 코드가 됨
