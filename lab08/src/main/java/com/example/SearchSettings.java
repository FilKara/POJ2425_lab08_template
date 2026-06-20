package com.example;

import java.time.LocalDate;

public class SearchSettings {

    private double yearFrom;
    private double yearTo;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private double milleageFrom;
    private double milleageTo;
    private  double priceFrom;
    private double priceTo;
    private String word;


    public void setYearFrom(double yearFrom) {
        this.yearFrom = yearFrom;
    }

    public void setYearTo(double yearTo) {
        this.yearTo = yearTo;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public void setMilleageFrom(double milleageFrom) {
        this.milleageFrom = milleageFrom;
    }

    public void setMilleageTo(double milleageTo) {
        this.milleageTo = milleageTo;
    }

    public void setPriceFrom(double priceFrom) {
        this.priceFrom = priceFrom;
    }

    public void setPriceTo(double priceTo) {
        this.priceTo = priceTo;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public double getYearFrom() {
        return yearFrom;
    }

    public double getYearTo() {
        return yearTo;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public double getMilleageFrom() {
        return milleageFrom;
    }

    public double getMilleageTo() {
        return milleageTo;
    }

    public double getPriceFrom() {
        return priceFrom;
    }

    public double getPriceTo() {
        return priceTo;
    }

    public String getWord() {
        return word;
    }
}
