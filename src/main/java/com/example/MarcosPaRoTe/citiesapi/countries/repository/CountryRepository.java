package com.example.MarcosPaRoTe.citiesapi.countries.repository;

import com.example.MarcosPaRoTe.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}