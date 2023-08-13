package com.ohgiraffers.level01.basic;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        // Calculator 클래스의 메소드를 호출 해서 실행
        Calculator calc = new Calculator();

        calc.checkMethod();

        String result = calc.sumTwoNumber(10, 20);

        System.out.println(result);

        String result2 = calc.multiTwoNumber(10, 20);

        System.out.println(result2);

        int result3 = calc.multiTwoNumber2(10, 20);

        System.out.println("10과 20의 곱은 " + result3);
    }
    
}
