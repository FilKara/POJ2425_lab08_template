package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByPriceFilter implements Filter {

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
        return searchSettings != null && (searchSettings.getPriceFrom() != 0.0 || searchSettings.getPriceTo() !=0.0);
    }

    @Override
    public List<CarOffer> filter() {
        if (!canFilter() || carOffers == null) return carOffers;
        return carOffers.stream().
                filter(car -> car.getPrice() >= searchSettings.getPriceFrom()).
                filter(car -> car.getPrice() <= searchSettings.getPriceTo()).
                collect(Collectors.toList());
    }
}
