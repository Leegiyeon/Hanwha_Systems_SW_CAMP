package com.ohgiraffers.section01.list.dto;

public class BookDTO implements Comparable<BookDTO> {
    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO() {
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }



    /* 설명. 가격에 대해 오름차순 기준 설정(Comparable 인터페이스 + compareTo 메소드 오버라이딩) */
    /* 필기.
     *  우리가 원하는 필드의 오름차순 또는 내림차순을 할 수 있다.
     *  필드가 4개면 총 8가지의 정렬기준을 가질 수 있다.
     *  정렬은 compareTo 메소드가 반환하는 int형의 부호에 따라 정해지게 되며 부호가 반대로 되면
     *  오름차순과 내림차순의 개념이 역전된다.
     *  (오름차순은 매개변수로 넘어온 것을 빼주는 형태로 작성하면 된다.(String형 제외))
    * */
//    @Override
//    public int compareTo(Object o) {

        /* 설명. 연산이 가능한 자료형(숫자형)에 대한 정렬기준 */
//        return this.price - ((BookDTO)o).price;                 // Memo. 가격의 오름차순(부호값에 따라 정해짐)
//        return ((BookDTO)o).price - this.price;                 // Memo. 가격의 내림차순
        /* 설명. 연산이 불가능한 자료형에 대한 정렬기준(String의 compareTo메소드 사용) */
//        return this.author.compareTo(((BookDTO)o).author);      // Memo. 작가의 오름차순
//        return -(this.author.compareTo(((BookDTO)o).author));   // Memo. 작가의 내림차순
//    }

    /* 설명. Comparable 인터페이스에 제네릭을 걸면 다운캐스팅이 불필요하다. */
    @Override
    public int compareTo(BookDTO o) {
        return this.title.compareTo(o.title);                     // Memo. 제목의 오름차순
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
