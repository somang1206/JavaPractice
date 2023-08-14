package com.ohgiraffers.level02.normal;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */

        String result = RandomMaker.rockPaperScissors();
        String result2 =  RandomMaker.tossCoin();

        System.out.println(result);
        System.out.println(result2);
    }

}
