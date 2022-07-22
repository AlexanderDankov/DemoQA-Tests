package com.simbirsoft.pages;

import com.codeborne.selenide.SelenideElement;
import com.simbirsoft.pages.components.CalendarComponent;
import com.simbirsoft.pages.components.GenderCheckboxComponent;
import com.simbirsoft.pages.components.HobbiesCheckboxComponent;
import com.simbirsoft.pages.components.StateAndCityMenuComponent;
import com.simbirsoft.tests.SubmittedFormAssertions;

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

    public void openPage() {
        open("/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value)  {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage setPhoneNumber(String value) {
        phoneNumberInput.setValue(value);
        return this;
    }

    public void setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
    }

    public void setSubject(String value) {
        subject.setValue(value).pressEnter();
    }

    public void uploadImage(String name) {
        uploadImage.uploadFromClasspath(name);
    }

    public void submitForm() {
        emailInput.pressEnter();
       // submitButton.click();
        submittedForm.shouldHave(text(SUBMITTED_TITLE));
    }


}
