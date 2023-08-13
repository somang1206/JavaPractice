package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /* 임의의 숫자를 입력받아 해당 계절을 출력해주세요
         * 단, 1~12사이의 숫자가 아닌 값이 들어는것은 "잘못입력하셨습니다"를 출력
         * 계절 구분
         * 봄 : 3월,4월,5월
         * 여름: 6월,7월,8월
         * 가을: 9월,10월,11월
         * 겨울: 12월,1월,2일
         *
         * -----  출력 -----
         * 숫자를 입력하세요 : 1
         * 겨울
         * */
        Scanner sc = new Scanner(System.in);

        System.out.print("1~12 사이의 정수 입력 : ");
        int num = sc.nextInt();

        String season = ""; // 계절에 대한 값을 담을 공간
                            // 1~12월 중에 하나라도 선택이되면 season변수에는 겨울,봄,여름,가을 이 4가지중에 하나의 값을 담을
                            // 선택이되지 않으면 빈값("")으로 값을 유지한다.

        switch(num) {
            case 12 :
            case 1 :
            case 2 :
                season = "겨울";
                break;
            case 3 :
            case 4 :
            case 5 :
                season = "봄";
                break;
            case 6 :
            case 7 :
            case 8 :
                season = "여름";
                break;
            case 9 :
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
        }

        if(season != "") {
            System.out.println(num + "월은 " + season + "입니다.");
        }

    }

}
