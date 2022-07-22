package com.simbirsoft.pages;

import com.codeborne.selenide.SelenideElement;
import com.simbirsoft.pages.components.CalendarComponent;
import com.simbirsoft.pages.components.GenderCheckboxComponent;
import com.simbirsoft.pages.components.HobbiesCheckboxComponent;
import com.simbirsoft.pages.components.StateAndCityMenuComponent;
import com.simbirsoft.tests.SubmittedFormAssertions;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("input#firstName"),
            lastNameInput = $("input#lastName"),
            emailInput = $("input#userEmail"),
            phoneNumberInput = $("input#userNumber"),
            currentAddressInput = $("textarea#currentAddress"),
            subject =  $("input#subjectsInput"),
            uploadImage = $("input#uploadPicture"),
            submitButton = $("#submit"),
            submittedForm = $("#example-modal-sizes-title-lg");

    private final String FORM_TITLE = "Student Registration Form",
                         SUBMITTED_TITLE = "Thanks for submitting the form";

    public CalendarComponent calendar = new CalendarComponent();
    public GenderCheckboxComponent genderCheckbox = new GenderCheckboxComponent();
    public HobbiesCheckboxComponent hobbiesCheckbox = new HobbiesCheckboxComponent();
    public StateAndCityMenuComponent stateAndCityMenu = new StateAndCityMenuComponent();
    public SubmittedFormAssertions submittedFormAssertions = new SubmittedFormAssertions();

    @Step("Открытие страницы с формой")
    public void openPage() {
        open("/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    @Step("Установка значения в поле Имя")
    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    @Step("Установка значения в поле Фамилия")
    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    @Step("Установка значени в поле Email")
    public RegistrationPage setEmail(String value)  {
        emailInput.setValue(value);
        return this;
    }

    @Step("Установка значения в поле Телефонный номер")
    public RegistrationPage setPhoneNumber(String value) {
        phoneNumberInput.setValue(value);
        return this;
    }

    @Step("Установка значения в поле Адрес")
    public void setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
    }

    @Step("Установка значения в поле Предмет")
    public void setSubject(String value) {
        subject.setValue(value).pressEnter();
    }

    @Step("Загрузка изображения")
    public void uploadImage(String name) {
        uploadImage.uploadFromClasspath(name);
    }

    @Step("Отправка формы")
    public void submitForm() {
        emailInput.pressEnter();
       // submitButton.click();
        submittedForm.shouldHave(text(SUBMITTED_TITLE));
    }


}
