package casting;

public class Casting2 {

    static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // 오류코드 (소수점이 있기 때문) intValue = doubleValue;
        intValue = (int)doubleValue; // 직접 대입해서 명시적 형변환 시킬 수 있다
        System.out.println(intValue);  // 형변환

        System.out.println("doubleValue= " + doubleValue);
    }
}
