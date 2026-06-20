package com.example;

import java.util.ArrayList;
import java.util.List;

public class Searcher {

    private List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public List<CarOffer> filter(List<CarOffer> cars, SearchSettings searchSettings) {

        List<CarOffer> filteredCars = new ArrayList<>(cars);
        for (Filter filter : filters) {
            filter.setSearchSettings(searchSettings);
            filter.setCarOffers(filteredCars);
            if (filter.canFilter()){
                filteredCars = filter.filter();
            }
        }
        return filteredCars;
    }
}
