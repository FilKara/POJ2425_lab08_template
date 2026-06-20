package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByDateFilter implements Filter {
    private List<CarOffer> cars;
    private SearchSettings searchSettings;

    @Override
    public void setCarOffers(List<CarOffer> cars) {
        this.cars = cars;
    }

    @Override
    public void setSearchSettings(SearchSettings searchSettings) {
        this.searchSettings = searchSettings;
    }

    @Override
    public boolean canFilter() {
        return searchSettings != null && (searchSettings.getDateFrom() != null ||  searchSettings.getDateTo() != null);
    }

    @Override
    public List<CarOffer> filter() {
        if (!canFilter() || cars == null) return cars;
        return cars.stream().
                filter(car -> searchSettings.getDateFrom() == null || !car.getDate().isBefore(searchSettings.getDateFrom())).
                filter(car -> searchSettings.getDateTo() == null || !car.getDate().isAfter(searchSettings.getDateTo()))
                .collect(Collectors.toList());
    }
}
