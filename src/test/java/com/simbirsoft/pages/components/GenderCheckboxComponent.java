package com.simbirsoft.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GenderCheckboxComponent {
    private SelenideElement genderWrapper = $("#genterWrapper");

    public void setGender(String gender) {
        if(gender.equalsIgnoreCase("male")) {
            String male = "[for=gender-radio-1]";
            genderWrapper.$(male).click();
        } else if(gender.equalsIgnoreCase("female")) {
            String female = "[for=gender-radio-2]";
            genderWrapper.$(female).click();
        } else {
            String other = "[for=gender-radio-3]";
            genderWrapper.$(other).click();
        }
    }
}
