package com.simbirsoft.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {
    @BeforeAll
    static void beforeAll() {

        Configuration.startMaximized = true;
        Configuration.browser = "firefox";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void practiceFormTests() {
        String firstName = "Alexander";
        String lastName = "Dankov";
        String email = "dankoffalexander@gmail.com";
        String phoneNumber = "8950723099";
        String subject = "Maths";
        String currentAddress = "Lenina str. 1";

        open("/automation-practice-form");
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
        $("textarea#currentAddress").setValue(currentAddress);
        $("#state").scrollIntoView(true).click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();

        $x("//td[text()='Student Name']").parent().shouldHave(text(firstName));
        $x("//td[text()='Student Email']").parent().shouldHave(text(email));
        $x("//td[text()='Gender']").parent().shouldHave(text("Male"));
        $x("//td[text()='Mobile']").parent().shouldHave(text(phoneNumber));
        $x("//td[text()='Date of Birth']").parent().shouldHave(text("30 May,1991"));
        $x("//td[text()='Subjects']").parent().shouldHave(text(subject));
        $x("//td[text()='Hobbies']").parent().shouldHave(text("Sports"));
        $x("//td[text()='Picture']").parent().shouldHave(text("img.png"));
        $x("//td[text()='Address']").parent().shouldHave(text(currentAddress));
        $x("//td[text()='State and City']").parent().shouldHave(text("Haryana Karnal"));

    }
}
