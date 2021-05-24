package com.github.erickkosta.citiesapi.countries.repository;

import com.github.erickkosta.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
