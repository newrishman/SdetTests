package com.newrishman.sdetTest.widgets;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class Chat {
    public void open() {
        Selenide.open("/");
    }

    // Можно из следующих двух методов сделать один, но стоит ли? Имея два метода с разными именами,
    //будет проще читать код сторонним людям. Иль ошибаюсь я?
    public void addNickName(String name) {
        $("#name").setValue(name);
    }
    public void writeMessage(String message) {
        $("#message").setValue(message);
    }

    public void enter(String button) {
        $(button).click();
    }
}
