package cond;

public class Switch3 {

    static void main(String[] args) {
        int grade = 2;
        int coupon;

        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:     // break가 없으면 2,3을 같이 출력해버림 그래서 break를 걸어줘야 정확한 값을 뽑을 수 있음
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
