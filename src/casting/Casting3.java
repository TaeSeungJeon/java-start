package casting;

public class Casting3 {

    static void main(String[] args) {
        long maxIntValue = 2147483647L;
        long maxIntOver = 2147483649L;// int 최대값
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting= " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting= " + intValue);
    }
}
