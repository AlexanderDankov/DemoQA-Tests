package com.simbirsoft.tests;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.simbirsoft.tests.TestData.*;

public class SubmittedFormAssertions {
    private final SelenideElement studentName =  $x("//td[text()='Student Name']").parent(),
                            studentEmail = $x("//td[text()='Student Email']").parent(),
                            studentGender =  $x("//td[text()='Gender']").parent(),
                            studentPhone = $x("//td[text()='Mobile']").parent(),
                            studentBirthDate = $x("//td[text()='Date of Birth']").parent(),
                            studentSubject = $x("//td[text()='Subjects']").parent(),
                            studentHobby = $x("//td[text()='Hobbies']").parent(),
                            studentImage = $x("//td[text()='Picture']").parent(),
                            studentAddress = $x("//td[text()='Address']").parent(),
                            studentStateAndCity = $x("//td[text()='State and City']").parent();

    @Step("Проверка введенных в форму данных")
    public void checkSubmittedFormData() {
        studentName.shouldHave(text(randomFirstName + " " + randomLastName));
        studentEmail.shouldHave(text(randomEmail));
        studentGender.shouldHave(text("Female"));
        studentPhone.shouldHave(text(randomPhoneNumber));
        studentBirthDate.shouldHave(text("24 February,1992"));
        studentSubject.shouldHave(text("Physics"));
        studentHobby.shouldHave(text("Reading"));
        studentImage.shouldHave(text("img.png"));
        studentAddress.shouldHave(text(randomAddress));
        studentStateAndCity.shouldHave(text("Haryana Karnal"));
    }
}
