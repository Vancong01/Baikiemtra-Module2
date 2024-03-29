package com.codegym.repository;

import com.codegym.model.City;
import com.codegym.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
public interface CityRepository extends PagingAndSortingRepository<City, Long> {
    Iterable<City> findAllByCountry(Country country);
}
