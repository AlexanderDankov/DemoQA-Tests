package com.simbirsoft.pages.components;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    private SelenideElement dateOfBirthInput =  $("input#dateOfBirthInput");

    public void setDate(String day, String month, String year) {
        dateOfBirthInput.click();
        $(".react-datepicker__month-select").selectOptionByValue(month);
        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__week").$(new Selectors.ByText(day)).click();
    }
}