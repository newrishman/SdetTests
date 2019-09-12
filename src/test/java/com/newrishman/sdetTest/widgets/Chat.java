package com.newrishman.sdetTest.widgets;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Chat {

    private String nickName = "My name";
    private String message = "something message";

    public Chat open() {
        Selenide.open("/");
        return this;
    }

    public Chat addNickName() {
        $("#name").setValue(nickName);
        return this;
    }

    public Chat writeMessage() {
        $("#message").setValue(message);
        return this;
    }

    public SelenideElement enterInChat() {
        String enterButton = ".submit";
        return $(enterButton);
    }

    public SelenideElement sendMessage() {
        String sendButton = ".primary";
        return $(sendButton);
    }


    public String getNickName() {
        return nickName;
    }

    public String getMessage() {
        return message;
    }


}
