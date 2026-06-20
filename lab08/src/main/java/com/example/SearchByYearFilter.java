package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByYearFilter implements Filter {

    private List<CarOffer> carOffers;
    private SearchSettings searchSettings;

    @Override
    public void setCarOffers(List<CarOffer> carOffers) {
        this.carOffers = carOffers;
    }

    @Override
    public void setSearchSettings(SearchSettings searchSettings) {
        this.searchSettings = searchSettings;
    }

    @Override
    public boolean canFilter() {
        return searchSettings != null && (searchSettings.getDateFrom() != null || searchSettings.getDateTo() != null);
    }

    @Override
    public List<CarOffer> filter() {
        if (!canFilter() || carOffers == null || carOffers.isEmpty()) return carOffers;
        return carOffers.stream().
                filter(car -> car.getYear() >= searchSettings.getYearFrom()).
                filter(car -> car.getYear() <= searchSettings.getYearTo())
                .collect(Collectors.toList());
    }
}
