package com.newrishman.sdetTest;

import com.codeborne.selenide.Condition;
import com.newrishman.sdetTest.testConfig.Config;
import com.newrishman.sdetTest.widgets.Chat;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class FirstTests extends Config {

    @Test
    public void start() {
        Chat chat = new Chat();
        chat.open()
                .addNickName()
                .enterInChat()
                .click();
        $(".primary").shouldBe(Condition.visible);
        $("#messageArea > li:nth-child(1) > p").shouldHave(Condition.exactText(chat.getNickName() + " joined!"));

        chat.writeMessage()
                .sendMessage()
                .click();
        $("#messageArea > li.chat-message > p").shouldHave(Condition.exactText(chat.getMessage())
        );
    }
}