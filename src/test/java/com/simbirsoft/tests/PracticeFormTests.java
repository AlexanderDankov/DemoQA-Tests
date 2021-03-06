package com.simbirsoft.tests;

import com.simbirsoft.pages.RegistrationPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.simbirsoft.tests.TestData.*;

public class PracticeFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Tag("successPracticeFormTest")
    @Test
    void practiceFormTests() {
        registrationPage.openPage();

        registrationPage.setFirstName(randomFirstName)
                        .setLastName(randomLastName)
                        .setEmail(randomEmail)
                        .setPhoneNumber(randomPhoneNumber)
                        .setCurrentAddress(randomAddress);

        registrationPage.genderCheckbox.setGender("Female");

        registrationPage.calendar.setDate("24","1","1992");

        registrationPage.setSubject("Physics");

        registrationPage.hobbiesCheckbox.setHobby("Reading");

        registrationPage.uploadImage("img.png");

        registrationPage.stateAndCityMenu.selectStateAndCity("Haryana", "Karnal");

        registrationPage.submitForm();

        registrationPage.submittedFormAssertions.checkSubmittedFormData();
    }

    @Tag("failedPracticeFormTest")
    @Test
    void failedPracticeFormTest() {
        registrationPage.openPage();

        registrationPage.setFirstName("Alexander")
                .setLastName("Dankov")
                .setEmail("dankov@gmail.com")
                .setPhoneNumber("8900456578")
                .setCurrentAddress("Moscow,Red Square");

        registrationPage.genderCheckbox.setGender("Male");

        registrationPage.calendar.setDate("24","1","1992");

        registrationPage.setSubject("Physics");

        registrationPage.hobbiesCheckbox.setHobby("Reading");

        registrationPage.uploadImage("img.png");

        registrationPage.stateAndCityMenu.selectStateAndCity("Haryana", "Karnal");

        registrationPage.submitForm();

        registrationPage.submittedFormAssertions.checkSubmittedFormData();
    }
}
