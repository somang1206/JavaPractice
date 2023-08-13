package com.ohgiraffers.section01.array.level03.hard;

public class Application2 {

    public static void main(String[] args) {

        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요
         * */
        int lotto[] = new int[6];

//		for(int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1;
//			for(int j = 0; j < i; j++) {
//				if(lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}

        label:
        for(int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
            for(int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    continue label;
                }
            }
        }

        int temp = 0;
        for(int i = 1; i < lotto.length; i++){
            for(int j = 0; j < lotto.length; j++){
                if(lotto[i] < lotto[j]){
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        for(int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

    }

}
