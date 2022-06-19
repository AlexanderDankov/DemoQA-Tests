package com.simbirsoft.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GenderCheckboxComponent {
    private SelenideElement genderWrapper = $("#genterWrapper");

    private String male = "[for=gender-radio-1]",
                   female = "[for=gender-radio-2]",
                   other = "[for=gender-radio-3]";

    public void setGender(String gender) {
        if(gender.equalsIgnoreCase("male")) {
            genderWrapper.$(male).click();
        } else if(gender.equalsIgnoreCase("female")) {
            genderWrapper.$(female).click();
        } else {
            genderWrapper.$(other).click();
        }
    }
}
