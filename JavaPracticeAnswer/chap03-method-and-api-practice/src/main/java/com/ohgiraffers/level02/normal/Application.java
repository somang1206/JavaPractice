package com.ohgiraffers.level02.normal;

import static com.ohgiraffers.level02.normal.RandomMaker.rockPaperScissors;
import static com.ohgiraffers.level02.normal.RandomMaker.tossCoin;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
        System.out.println(rockPaperScissors());

        System.out.println(tossCoin());
    }

}
