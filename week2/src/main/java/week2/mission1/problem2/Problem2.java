package week2.mission1.problem2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

    static Book TaebaekSanmaek = new Book("태백산맥","조정래");
    static Book SelfishGene = new Book("이기적 유전자", "리처드 도킨즈");
    static Book JajeongeoDoduk = new Book("자전거 도둑", "박완서");
    static Book Toji = new Book("토지", "박경리");
    static Book Upheaval = new Book("대변동", "제레드 다이아몬드");

    // 온마을 도서관에 있는 책들
    static List<Book> A = Arrays.asList(TaebaekSanmaek,SelfishGene,JajeongeoDoduk,Toji,Upheaval);
    static List<Book> A_1 = new ArrayList<>();
    static List<Book> B;

    public static void main(String[] args) throws IOException {
        // 문제 조건 입력
        problemInit();

        /* 온마을(A)도서관에 다음과 같이 책 목록이 변경되었습니다.
            (수정) 3번째 목록
            [자전거 도둑| 박완서] => [그 많던 싱아는 누가 다 먹었을까| 박완서] */
        A.get(3).editBook("그 많던 싱아는 누가 다 먹었을까","박완서");

        /* 두마을(B)도서관에 책이 추가되었습니다.
            (추가)마지막 목록
            [사피엔스|유발 하라리] */
        Book sapiens = new Book("사피엔스", "유발 하라리");
        B.add(sapiens);

        // 결과 출력
        System.out.println("----- 온마을 도서관 책 목록");
        printArray(A);
        System.out.println();

        System.out.println("----- 온마을 도서관 책 목록 복사본");
        printArray(A_1);
        System.out.println();

        System.out.println("----- 두나을 도서관 책 목록");
        printArray(B);
        System.out.println();
    }

    // 문제 조건 초기화
    static void problemInit() throws IOException {
        // A-1 생성 : 얕은 복사
        A_1 = A;

        // B 생성
        B = new ArrayList<>();
        for (Book book : A) {
            B.add(book);
        }
    }

    // 문제 결과 출력
    static void printArray(List<Book> books) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Book book : books) {
            bw.write("제목 : "+book.getTitle()+", 저자 : "+book.getAuthor()+"\n");
        }
        bw.write("끝.\n");
        bw.flush();
    }
}
