package aletheiauk.contractsfinder.api;

import aletheiauk.contractsfinder.api.responses.CountriesResponse;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ContractsFinderService {
    @GET("Country/Countries")
    Call<CountriesResponse> getCountries();
}
