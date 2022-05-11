package com.simbirsoft.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
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
        String phoneNumber = "89507230992";
        String subject = "Maths";
        String currentAddress = "Lenina str. 1";

        open("https://demoqa.com/automation-practice-form");
        $("input#firstName").setValue(firstName);
        $("input#lastName").setValue(lastName);
        $("input#userEmail").setValue(email);
        $("#genterWrapper").$("[for=gender-radio-1]").click();
        $("input#userNumber").setValue(phoneNumber);
        $("input#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("5");
        $(".react-datepicker__year-select").selectOptionByValue("1991");
        $(".react-datepicker__week").$(new Selectors.ByText("30")).click();
        $("input#subjectsInput").setValue(subject).pressEnter();
        $("#hobbiesWrapper").$("[for=hobbies-checkbox-1]").click();
        $("input#uploadPicture").uploadFromClasspath("img.png");

        $("#submit").click();


    }
}
