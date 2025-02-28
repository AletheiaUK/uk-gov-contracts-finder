package com.github.aletheiauk.contractsfinder;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.github.aletheiauk.contractsfinder.types.Country;
import com.github.aletheiauk.contractsfinder.types.Region;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ContractsFinderClientTest {
  private static MockWebServer server;
  private static ContractsFinderClient client;

  private static final String COUNTRIES_RESPONSE_JSON =
      """
                {
                    "countries": [
                        {
                            "name": "England",
                            "code": "ENG"
                        },
                        {
                            "name": "Northern Ireland",
                            "code": "NIR"
                        },
                        {
                            "name": "Scotland",
                            "code": "SCT"
                        },
                        {
                            "name": "Wales",
                            "code": "WLS"
                        }
                    ]
                }
            """;
  private static final Country ENGLAND = new Country("England", "ENG");
  private static final Country WALES = new Country("Wales", "WLS");
  private static final Country SCOTLAND = new Country("Scotland", "SCT");
  private static final Country NORTHERN_IRELAND = new Country("Northern Ireland", "NIR");
  private static final List<Country> EXPECTED_COUNTRIES =
      List.of(ENGLAND, WALES, SCOTLAND, NORTHERN_IRELAND);

  private static final String REGIONS_RESPONSE_JSON =
      """
            {
              "regions": [
                {
                  "id": 1,
                  "name": "East Midlands"
                },
                {
                  "id": 2,
                  "name": "London"
                }
              ]
            }
            """;

  private static final Region EAST_MIDLANDS = new Region(1, "East Midlands");
  private static final Region LONDON = new Region(2, "London");
  private static final List<Region> EXPECTED_REGIONS = List.of(EAST_MIDLANDS, LONDON);

  @BeforeAll
  static void setUp() throws IOException {
    server = new MockWebServer();
    server.start();
    final String baseUrl = server.url("/").toString();
    client = new ContractsFinderClient(baseUrl);
  }

  @AfterAll
  static void tearDown() throws IOException {
    server.shutdown();
  }

  @Test
  void testCountries() throws Exception {
    server.enqueue(
        new MockResponse()
            .setBody(COUNTRIES_RESPONSE_JSON)
            .addHeader("Content-Type", "application/json"));

    CompletableFuture<List<Country>> future = client.countries();
    List<Country> result = future.get(); // Blocking for test purposes

    assertTrue(result.containsAll(EXPECTED_COUNTRIES));
  }

  @Test
  void testRegions() throws Exception {
    server.enqueue(
        new MockResponse()
            .setBody(REGIONS_RESPONSE_JSON)
            .addHeader("Content-Type", "application/json"));

    CompletableFuture<List<Region>> future = client.regions();
    List<Region> result = future.get();

    System.out.println(result);

    assertTrue(result.containsAll(EXPECTED_REGIONS));
  }
}
