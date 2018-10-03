package com.jepark.inflearn.chap1.lineedit;

/**
 * Created by jepark3452@gmail.com on 03/10/2018
 * Blog: http://jepark3452.tistory.com/
 * Github: https://github.com/jepark3452
 */
public class LineCopy {

    public static void main(String[] args) {
        LineCopy lineCopy = new LineCopy();
        lineCopy.copyLine();
    }

    public void copyLine() {
        System.out.println("현재 줄을 복사합니다.");
        // 라인 삭제하기: Command + delete
        // 라인 복사하기: Command + D
        System.out.println("현재 줄을 복사합니다.");
    }
}
