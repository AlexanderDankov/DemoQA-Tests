package com.simbirsoft.tests;

import com.simbirsoft.pages.RegistrationPage;
import org.junit.jupiter.api.Test;
import static com.simbirsoft.tests.TestData.*;

public class PracticeFormTests extends TestBase {


    @Test
    void practiceFormTests() {
        RegistrationPage registrationPage = new RegistrationPage();

        registrationPage.openPage();

        registrationPage.setFirstName(randomFirstName)
                        .setLastName(randomLastName)
                        .setEmail(randomEmail)
                        .setPhoneNumber(randomPhoneNumber)
                        .setCurrentAddress(randomAddress);

        registrationPage.genderCheckbox.setGender("Male");

        registrationPage.calendar.setDate("30","5","1991");

        registrationPage.setSubject("Math");

        registrationPage.hobbiesCheckbox.setHobby("Sports");

        registrationPage.uploadImage("img.png");

        registrationPage.stateAndCityMenu.selectStateAndCity("Haryana", "Karnal");

        registrationPage.submitForm();

        registrationPage.submittedFormAssertions.checkSubmittedFormData();
    }
}
