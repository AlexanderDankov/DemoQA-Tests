package com.simbirsoft.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateAndCityMenuComponent {
    private SelenideElement stateOptions = $("#state"),
                            cityOptions = $("#city");

    public void selectStateAndCity(String state, String city) {
        stateOptions.scrollIntoView(true).click();
        $(byText(state)).click();
        cityOptions.click();
        $(byText(city)).click();
    }
}
