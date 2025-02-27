package aletheiauk.contractsfinder;

import aletheiauk.contractsfinder.types.Country;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContractsFinderClientTest {
    private static MockWebServer server;
    private static ContractsFinderClient client;

    private static final String VALID_RESPONSE = """
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
    private static final List<Country> EXPECTED_COUNTRIES = List.of(ENGLAND, WALES, SCOTLAND, NORTHERN_IRELAND);

    @BeforeAll
    static void setUp() throws IOException {
        server = new MockWebServer();
        server.start();
        client = new ContractsFinderClient();
    }

    @AfterAll
    static void tearDown() throws IOException {
        server.shutdown();
    }

    @Test
    void testCountries() throws Exception {
        server.enqueue(new MockResponse()
                .setBody(VALID_RESPONSE)
                .addHeader("Content-Type", "application/json"));

        CompletableFuture<List<Country>> future = client.countries();
        List<Country> result = future.get(); // Blocking for test purposes

        assertTrue(result.containsAll(EXPECTED_COUNTRIES));
    }
}
