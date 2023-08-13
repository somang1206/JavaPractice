package com.ohgiraffers.level02.normal.student.run;

import com.ohgiraffers.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 후
        //모든 필드 정보를 출력하는 printInformation() 메소드 호출하여 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 학년을 입력하세요: ");
        int grade = sc.nextInt();
        System.out.print("학생의 학급을 입력하세요 : ");
        int classroom = sc.nextInt();
        System.out.print("학생의 이름을 입력하세요 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("학생의 키를 입력하세요 : ");
        double height = sc.nextDouble();
        System.out.print("학생의 성별을 입력하세요(남/여) : ");
        char gender = sc.next().charAt(0);

        StudentVO student = new StudentVO(grade, classroom, name, height, gender);

        student.printInformation();
    }
}
