package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByMillageFilter implements Filter {
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
        return searchSettings != null;
    }

    @Override
    public List<CarOffer> filter() {
        if (!canFilter() ||cars == null || cars.isEmpty()) return cars;
        return cars.stream().
                filter(car -> car.getMilleage() >= searchSettings.getMilleageFrom()).
                filter(car -> car.getMilleage() <= searchSettings.getMilleageTo()).
                collect(Collectors.toList());
    }
}
