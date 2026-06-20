package com.example;

import java.util.List;

public interface Filter {
    void setCarOffers(List<CarOffer> cars);
    void setSearchSettings(SearchSettings searchSettings);
    boolean canFilter();
    List<CarOffer> filter();
}
