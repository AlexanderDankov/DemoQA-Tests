package com.simbirsoft.tests;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();

    public static
            String randomFirstName = faker.name().firstName(),
                   randomLastName = faker.name().lastName(),
                   randomEmail = faker.internet().emailAddress(),
                   randomPhoneNumber = faker.number().digits(10),
                   randomAddress = faker.address().fullAddress();


//    String firstName = "Alexander";
//    String lastName = "Dankov";
//    String email = "dankoffalexander@gmail.com";
//    String phoneNumber = "8950723099";
//    String subject = "Maths";
//    String currentAddress = "Lenina str. 1";
}
