package com.jepark.inflearn.chap1.view;

/**
 * Created by jepark3452@gmail.com on 03/10/2018
 * Blog: http://jepark3452.tistory.com/
 * Github: https://github.com/jepark3452
 */
public class EmailSender {

    private long count;
    private String name;
    private String email;
    private String from;
    private String to;

    EmailSender(long count, String name, String email) {
        this.count = count;
        this.name = name;
        this.email = email;
    }

    public static void receive(String from, String to) {
        System.out.println("from: " + from + ", to: " + to);
    }
}
