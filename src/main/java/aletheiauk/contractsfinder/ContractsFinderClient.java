package aletheiauk.contractsfinder;

import aletheiauk.contractsfinder.api.ContractsFinderService;
import aletheiauk.contractsfinder.api.responses.CountriesResponse;
import aletheiauk.contractsfinder.types.Country;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ContractsFinderClient {

    private static final String CONTRACTS_FINDER_BASE_URL = "https://www.contractsfinder.service.gov.uk";
    private final ContractsFinderService contractsFinderService;

    public ContractsFinderClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, SECONDS)
                .readTimeout(10, SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CONTRACTS_FINDER_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contractsFinderService = retrofit.create(ContractsFinderService.class);
    }

    public CompletableFuture<List<Country>> countries() {
        final CompletableFuture<List<Country>> future = new CompletableFuture<>();
        final Call<CountriesResponse> getCountriesCall = contractsFinderService.getCountries();

        getCountriesCall.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<CountriesResponse> call, Response<CountriesResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    future.complete(response.body().countries());
                } else {
                    future.completeExceptionally(
                            new RuntimeException("API call failed with code: " + response.code())
                    );
                }
            }

            @Override
            public void onFailure(Call<CountriesResponse> call, Throwable throwable) {
                future.completeExceptionally(throwable);
            }
        });

        return future;
    }
}
