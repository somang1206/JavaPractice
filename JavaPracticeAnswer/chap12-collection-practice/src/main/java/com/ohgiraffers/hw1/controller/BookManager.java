package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<BookDTO>();
    }

    /**
     * <pre>
     *   입력한 도서 객체 추가
     * </pre>
     */
    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    /**
     * <pre>
     *   선택한 도서 삭제
     * </pre>
     */
    public void deleteBook(int index) {
        if(index != 0) {
            index--;
        }
        bookList.remove(index);
    }

    /**
     * <pre>
     *   도서명이 일치하는 객체를 찾아서 리턴
     *   리스트에 입력한 제목이 있는 경우 해당 인덱스를 반환
     *   없으면 -1을 리턴
     */
    public void searchBook(String bTitle) {

        int result = -1;

        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getTitle().equals(bTitle)) {
                result = i;
                break;
            }
        }

        if(result > -1) {
            System.out.println(bookList.get(result));
        } else {
            System.out.println("조회된 도서가 목록에 없습니다.");
        }
    }


    /**
     * <pre>
     *    도서목록 전체 조회
     * </pre>
     */
    public void displayAll() {

        if(bookList.size() > 0) {
            for(BookDTO bd : bookList) {
                System.out.println(bd);
            }
        } else {
            System.out.println("출력결과가 없습니다.");
        }

    }

    /**
     * <pre>
     *  정렬방식별 오름차순/내림차순 정렬
     * </pre>
     */
    public List<BookDTO> sortedBookList(int type) {

        switch(type) {
            case 1 : bookList.sort(new AscBookNo());
                break;
            case 2 : bookList.sort(new DescBookNo());
                break;
            case 3 : bookList.sort(new AscBookTitle());
                break;
            case 4 : bookList.sort(new DescBookTitle());
                break;
        }

        return bookList;
    }

    public void printBookList(List<BookDTO> printList) {
        for(BookDTO bd : printList) {
            System.out.println(bd);
        }
    }

}
