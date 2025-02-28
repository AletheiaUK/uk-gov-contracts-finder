package com.github.aletheiauk.contractsfinder.api;

import com.github.aletheiauk.contractsfinder.api.responses.CountriesResponse;
import com.github.aletheiauk.contractsfinder.api.responses.RegionsResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ContractsFinderService {
  @GET("Country/Countries")
  Call<CountriesResponse> getCountries();

  @GET("Region/Regions")
  Call<RegionsResponse> getRegions();
}
