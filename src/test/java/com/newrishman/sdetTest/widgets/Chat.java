package com.newrishman.sdetTest.widgets;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class Chat {
    public void open() {
        Selenide.open("/");
    }

    public void addNickName(String name) {
        $("#name").setValue(name);
    }

    public void enter() {
        $(".submit").click();
    }

    public void writeMessage(String message) {
        $("#message").setValue(message);
        $(".primary").click();
    }
}
