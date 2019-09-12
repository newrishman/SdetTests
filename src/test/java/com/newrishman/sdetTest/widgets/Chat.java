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

    public SelenideElement enterInChatButton() {
        String enterButton = ".submit";
        return $(enterButton);
    }

    public SelenideElement sendMessageButton() {
        String sendButton = ".primary";
        return $(sendButton);
    }

    public SelenideElement enterInterface() {
        return $(".primary");
    }

    public SelenideElement joinMessage() {
        return $("#messageArea > li:nth-child(1) > p");
    }

    public SelenideElement userMessage() {
        return $("#messageArea > li.chat-message > p");
    }

    public String getNickName() {
        return nickName;
    }

    public String getMessage() {
        return message;
    }
}