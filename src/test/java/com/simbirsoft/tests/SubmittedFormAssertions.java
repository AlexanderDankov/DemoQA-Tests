package com.simbirsoft.tests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.simbirsoft.tests.TestData.*;

public class SubmittedFormAssertions {
    private SelenideElement studentName =  $x("//td[text()='Student Name']").parent(),
                            studentEmail = $x("//td[text()='Student Email']").parent(),
                            studentGender =  $x("//td[text()='Gender']").parent(),
                            studentPhone = $x("//td[text()='Mobile']").parent(),
                            studentBirthDate = $x("//td[text()='Date of Birth']").parent(),
                            studentSubject = $x("//td[text()='Subjects']").parent(),
                            studentHobby = $x("//td[text()='Hobbies']").parent(),
                            studentImage = $x("//td[text()='Picture']").parent(),
                            studentAddress = $x("//td[text()='Address']").parent(),
                            studentStateAndCity = $x("//td[text()='State and City']").parent();

    public void checkSubmittedFormData() {
        studentName.shouldHave(text(randomFirstName + " " + randomLastName));
        studentEmail.shouldHave(text(randomEmail));
        studentGender.shouldHave(text("Male"));
        studentPhone.shouldHave(text(randomPhoneNumber));
        studentBirthDate.shouldHave(text("30 May,1991"));
        studentSubject.shouldHave(text("Math"));
        studentHobby.shouldHave(text("Sports"));
        studentImage.shouldHave(text("img.png"));
        studentAddress.shouldHave(text(randomAddress));
        studentStateAndCity.shouldHave(text("Haryana Karnal"));
    }
}
