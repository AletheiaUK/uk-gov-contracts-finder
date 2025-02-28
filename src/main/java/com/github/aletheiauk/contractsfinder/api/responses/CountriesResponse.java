package com.github.aletheiauk.contractsfinder.api.responses;

import com.github.aletheiauk.contractsfinder.types.Country;
import java.util.List;

public record CountriesResponse(List<Country> countries) {
  public CountriesResponse(final List<Country> countries) {
    this.countries = List.copyOf(countries);
  }

  @Override
  public List<Country> countries() {
    return List.copyOf(countries);
  }
}
