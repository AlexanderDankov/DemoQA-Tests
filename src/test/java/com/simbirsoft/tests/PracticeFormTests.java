package com.simbirsoft.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.simbirsoft.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.simbirsoft.tests.TestData.*;

public class PracticeFormTests extends TestBase {


    @Test
    void practiceFormTests() {
        RegistrationPage registrationPage = new RegistrationPage();
        String subject = "Maths";

        registrationPage.openPage();

        registrationPage.setFirstName(randomFirstName)
                        .setLastName(randomLastName)
                        .setEmail(randomEmail)
                        .setPhoneNumber(randomPhoneNumber)
                        .setCurrentAddress(randomAddress);

        registrationPage.genderCheckbox.setGender("Male");

        registrationPage.calendar.setDate("30","5","1991");

        $("input#subjectsInput").setValue(subject).pressEnter();
        $("#hobbiesWrapper").$("[for=hobbies-checkbox-1]").click();
        $("input#uploadPicture").uploadFromClasspath("img.png");



        $("#state").scrollIntoView(true).click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();

        $x("//td[text()='Student Name']").parent().shouldHave(text(randomFirstName));
        $x("//td[text()='Student Email']").parent().shouldHave(text(randomEmail));
        $x("//td[text()='Gender']").parent().shouldHave(text("Male"));
        $x("//td[text()='Mobile']").parent().shouldHave(text(randomPhoneNumber));
        $x("//td[text()='Date of Birth']").parent().shouldHave(text("30 May,1991"));
        $x("//td[text()='Subjects']").parent().shouldHave(text(subject));
        $x("//td[text()='Hobbies']").parent().shouldHave(text("Sports"));
        $x("//td[text()='Picture']").parent().shouldHave(text("img.png"));
        $x("//td[text()='Address']").parent().shouldHave(text(randomAddress));
        $x("//td[text()='State and City']").parent().shouldHave(text("Haryana Karnal"));

    }
}
