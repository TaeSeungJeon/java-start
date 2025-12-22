package Scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// 문자열 입력할 수 있는 코드를 만들고 exit 으로 빠져나오는 while 반복문을 만들어보자

        while (true) {
            System.out.print("문자열을 입력하시오.(종료하려면: exit): ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력하신 문자열은: " + str);
        }
    }
}
