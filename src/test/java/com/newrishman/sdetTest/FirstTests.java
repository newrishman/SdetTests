package com.newrishman.sdetTest;

import com.codeborne.selenide.Condition;
import com.newrishman.sdetTest.testConfig.Config;
import com.newrishman.sdetTest.widgets.Chat;
import org.junit.Test;

public class FirstTests extends Config {

    @Test
    public void start() {
        Chat chat = new Chat();
        chat.open()
                .addNickName()
                .enterInChatButton().click();

        chat.enterInterface().shouldBe(Condition.visible);
        chat.joinMessage().shouldHave(
                Condition.exactText(chat.getNickName() + " joined!"));

        chat.writeMessage()
                .sendMessageButton().click();

        chat.userMessage().shouldHave(
                Condition.exactText(chat.getMessage()));
    }
}