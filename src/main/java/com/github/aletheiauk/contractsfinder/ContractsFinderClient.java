package com.github.aletheiauk.contractsfinder;

import static java.util.concurrent.TimeUnit.SECONDS;

import com.github.aletheiauk.contractsfinder.api.ContractsFinderService;
import com.github.aletheiauk.contractsfinder.api.responses.ContractListResponse;
import com.github.aletheiauk.contractsfinder.api.responses.CountriesResponse;
import com.github.aletheiauk.contractsfinder.api.responses.RegionsResponse;
import com.github.aletheiauk.contractsfinder.types.Contract;
import com.github.aletheiauk.contractsfinder.types.Country;
import com.github.aletheiauk.contractsfinder.types.Region;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ContractsFinderClient {

  private static final String CONTRACTS_FINDER_BASE_URL =
      "https://www.contractsfinder.service.gov.uk";
  private final ContractsFinderService contractsFinderService;

  public ContractsFinderClient() {
    this(CONTRACTS_FINDER_BASE_URL);
  }

  protected ContractsFinderClient(final String baseURL) {
    OkHttpClient okHttpClient =
        new OkHttpClient.Builder().connectTimeout(10, SECONDS).readTimeout(10, SECONDS).build();

    Retrofit retrofit =
        new Retrofit.Builder()
            .baseUrl(baseURL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    contractsFinderService = retrofit.create(ContractsFinderService.class);
  }

  public CompletableFuture<List<Country>> countries() {
    final CompletableFuture<List<Country>> future = new CompletableFuture<>();
    final Call<CountriesResponse> getCountriesCall = contractsFinderService.getCountries();

    getCountriesCall.enqueue(
        new Callback<>() {
          @Override
          public void onResponse(
              Call<CountriesResponse> call, Response<CountriesResponse> response) {
            if (response.isSuccessful() && response.body() != null) {
              future.complete(response.body().countries());
            } else {
              future.completeExceptionally(
                  new RuntimeException("API call failed with code: " + response.code()));
            }
          }

          @Override
          public void onFailure(Call<CountriesResponse> call, Throwable throwable) {
            future.completeExceptionally(throwable);
          }
        });

    return future;
  }

  public CompletableFuture<List<Region>> regions() {
    final CompletableFuture<List<Region>> future = new CompletableFuture<>();
    final Call<RegionsResponse> getRegionsCall = contractsFinderService.getRegions();

    getRegionsCall.enqueue(
        new Callback<>() {
          @Override
          public void onResponse(Call<RegionsResponse> call, Response<RegionsResponse> response) {
            if (response.isSuccessful() && response.body() != null) {
              future.complete(response.body().regions());
            } else {
              future.completeExceptionally(
                  new RuntimeException("API call failed with code: " + response.code()));
            }
          }

          @Override
          public void onFailure(Call<RegionsResponse> call, Throwable throwable) {
            future.completeExceptionally(throwable);
          }
        });

    return future;
  }

  public CompletableFuture<List<Contract>> contractsFromToday() {
    final CompletableFuture<List<Contract>> future = new CompletableFuture<>();
    final Call<ContractListResponse> getContractsCall =
        contractsFinderService.getContractsForToday();

    getContractsCall.enqueue(
        new Callback<>() {

          @Override
          public void onResponse(
              Call<ContractListResponse> call, Response<ContractListResponse> response) {
            if (response.isSuccessful() && response.body() != null) {
              future.complete(response.body().contracts());
            } else {
              future.completeExceptionally(
                  new RuntimeException("API call failed with code: " + response.code()));
            }
          }

          @Override
          public void onFailure(Call<ContractListResponse> call, Throwable throwable) {
            future.completeExceptionally(throwable);
          }
        });

    return future;
  }

  public CompletableFuture<List<Contract>> contractsFromDay(int year, int month, int day) {
    final CompletableFuture<List<Contract>> future = new CompletableFuture<>();
    final Call<ContractListResponse> getContractsCall =
        contractsFinderService.getContractsByDay(year, month, day);

    getContractsCall.enqueue(
        new Callback<>() {

          @Override
          public void onResponse(
              Call<ContractListResponse> call, Response<ContractListResponse> response) {
            if (response.isSuccessful() && response.body() != null) {
              future.complete(response.body().contracts());
            } else {
              future.completeExceptionally(
                  new RuntimeException("API call failed with code: " + response.code()));
            }
          }

          @Override
          public void onFailure(Call<ContractListResponse> call, Throwable throwable) {
            future.completeExceptionally(throwable);
          }
        });

    return future;
  }
}
