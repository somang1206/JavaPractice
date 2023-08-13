package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {}

    public void mainMenu() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 선택 : ");

            int menu = sc.nextInt();
            BookMenu bookMenu = new BookMenu();

            switch(menu) {
                case 1:	bm.addBook(bookMenu.inputBook());
                    break;
                case 2:	bm.printBookList(selectSortedBook());
                    break;
                case 3:
                    bm.deleteBook(bookMenu.inputBookNo());
                    break;
                case 4:	bm.searchBook(bookMenu.inputBookTitle());
                    break;
                case 5: bm.displayAll();
                    break;
                case 6:
                    System.out.print("정말 끝내시겠습니까? (y/n) : ");
                    char answer = sc.next().toUpperCase().charAt(0);

                    if(answer == 'Y') {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    } else System.out.println("메뉴를 다시 불러옵니다.");

                    break;
                default : System.out.println("잘못 입력하셨습니다.");
            }
        }while(true);
    }

    /**
     * <pre>
     *  도서정보 입력
     * </pre>
     */
    public BookDTO inputBook() {

        System.out.println("내용을 입력하세요.");
        System.out.print("도서번호(ISBN) : ");
        int bNo = sc.nextInt();
        System.out.print("카테고리 (1.인문/2.자연과학/3.의료/4.기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("책제목 : ");
        String bTitle = sc.nextLine();
        System.out.print("저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, bTitle, author);
    }

    /**
     * <pre>
     *   조회할 도서명 입력
     * </pre>
     */
    public String inputBookTitle() {

        System.out.println("확인할 도서명을 입력해주세요.");
        System.out.print("책제목 : ");
        return sc.next();
    }

    /**
     * <pre>
     *   조회할 도서 번호 입력
     * </pre>
     */
    public int inputBookNo() {

        System.out.println("삭제할 도서의 번호를 입력해 주세요");
        System.out.print("도서 번호 : ");

        return sc.nextInt();
    }

    public List<BookDTO> selectSortedBook() {

        System.out.println("도서 출력 시 정렬 방식을 선택하세요");
        System.out.println("1. 도서번호(ISBN)으로 오름차순 정렬");
        System.out.println("2. 도서번호(ISBN)으로 내림차순 정렬");
        System.out.println("3. 책 제목으로 오름차순 정렬");
        System.out.println("4. 책 제목으로 내림차순 정렬");
        System.out.print("입력 : ");
        int inputNum = sc.nextInt();
        List<BookDTO> list = bm.sortedBookList(inputNum);

        return list;
    }

}
