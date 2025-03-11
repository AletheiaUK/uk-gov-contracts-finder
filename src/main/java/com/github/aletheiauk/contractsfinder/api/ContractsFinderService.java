package com.github.aletheiauk.contractsfinder.api;

import com.github.aletheiauk.contractsfinder.api.responses.ContractListResponse;
import com.github.aletheiauk.contractsfinder.api.responses.CountriesResponse;
import com.github.aletheiauk.contractsfinder.api.responses.RegionsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ContractsFinderService {
  @GET("Country/Countries")
  Call<CountriesResponse> getCountries();

  @GET("Region/Regions")
  Call<RegionsResponse> getRegions();

  @GET("Harvester/Notices/Data/CSV/Daily")
  @Headers("Accept: text/csv")
  Call<ContractListResponse> getContractsForToday();

  @GET("Harvester/Notices/Data/CSV/{year}/{month}/{day}")
  @Headers("Accept: text/csv")
  Call<ContractListResponse> getContractsByDay(
      @Path("year") int year, @Path("month") int month, @Path("day") int day);
}
