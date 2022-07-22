package com.simbirsoft.pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateAndCityMenuComponent {
    private SelenideElement stateOptions = $("#state"),
                            cityOptions = $("#city");

    @Step("Установка значения в поля Штат и Город")
    public void selectStateAndCity(String state, String city) {
        stateOptions.scrollIntoView(true).click();
        $(byText(state)).click();
        cityOptions.click();
        $(byText(city)).click();
    }
}
