package com.ohgiraffers.level01.basic;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // Calculator 클래스의 메소드를 호출 해서 실행
        calculator.checkMethod();

        String result2 = calculator.sumTwoNumber(10, 20);

        String result3 = calculator.multiTwoNumber(10, 20);

        System.out.println(result2);
        System.out.println(result3);
    }
    
}
