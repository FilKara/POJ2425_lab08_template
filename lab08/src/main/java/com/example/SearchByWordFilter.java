package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByWordFilter implements Filter {
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
        return searchSettings != null && searchSettings.getWord() != null && !searchSettings.getWord().isBlank();
    }

    @Override
    public List<CarOffer> filter() {
        if (!canFilter() || carOffers == null || carOffers.isEmpty()) return carOffers;

        return carOffers.stream().
                filter(carOffer -> carOffer.getTitle() != null && carOffer.getTitle().contains(searchSettings.getWord()))
                .collect(Collectors.toList());


    }
}
