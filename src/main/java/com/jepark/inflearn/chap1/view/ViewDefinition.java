package com.jepark.inflearn.chap1.view;

/**
 * Created by jepark3452@gmail.com on 03/10/2018
 * Blog: http://jepark3452.tistory.com/
 * Github: https://github.com/jepark3452
 */
public class ViewDefinition {

    public void viewDefinition() {
        EmailSender emailSender = new EmailSender(1L, "jepark3452", "jepark3452@gmail.com");
        // 메소드의 구현부 미리보기: Option + Space
        emailSender.send("test@gmail.com");
    }
}
