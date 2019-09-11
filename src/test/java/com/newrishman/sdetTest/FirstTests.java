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
        String nickName = "My name";
        String message = "something message";

        chat.open();
        chat.addNickName(nickName);
        chat.enter();

        $(".primary").shouldBe(Condition.visible);
        $("#messageArea").shouldHave(Condition.exactText(nickName + " joined!"));

        chat.writeMessage(message);
        $("#messageArea").shouldHave(Condition.exactText(
                nickName + " joined!\n" + nickName + "\n" + message
                )
        );

    }
}
