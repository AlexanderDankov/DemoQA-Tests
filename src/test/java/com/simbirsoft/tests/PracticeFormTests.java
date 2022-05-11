package com.simbirsoft.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void practiceFormTests() {
        String firstName = "Alexander";
        String lastName = "Dankov";
        String email = "dankoffalexander@gmail.com";

        open("https://demoqa.com/automation-practice-form");
        $("input#firstName").setValue(firstName);
        $("input#lastName").setValue(lastName);
        $("input#userEmail").setValue(email);
        $("#submit").click();


    }
}
