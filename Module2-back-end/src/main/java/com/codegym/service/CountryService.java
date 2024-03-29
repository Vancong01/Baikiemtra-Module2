package com.codegym.service;

import com.codegym.model.Country;

public interface CountryService {
    Iterable<Country> findAll();

    void save(Country country);

    Country findById(Long id);

    void remove(Long id);
}
