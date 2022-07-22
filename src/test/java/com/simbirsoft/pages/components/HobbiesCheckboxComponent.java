package com.simbirsoft.pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HobbiesCheckboxComponent {
    private SelenideElement hobbiesWrapper = $("#hobbiesWrapper");

    private String sports = "[for=hobbies-checkbox-1]",
                   reading = "[for=hobbies-checkbox-2]",
                   music = "[for=hobbies-checkbox-3]";

    @Step("Установка значения в поле Хобби")
    public void setHobby(String hobby) {
        if(hobby.equalsIgnoreCase("sports")) {
            hobbiesWrapper.$(sports).click();
        } else if(hobby.equalsIgnoreCase("reading")) {
            hobbiesWrapper.$(reading).click();
        } else {
            hobbiesWrapper.$(music).click();
        }
    }
}
