import Models.CatModel;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;

import java.io.IOException;

public class CatApiClient {
    private HttpRequestFactory requestFactory;
    private HttpHeaders headers;
    private Gson gson;

    public CatApiClient(){
        requestFactory = new NetHttpTransport().createRequestFactory();

        headers = new HttpHeaders();
        headers.set("x-api-key","efd87722-3488-4958-9d0c-8e980aee9759");

        gson = new Gson();
    }

    //Get list of cat breed info
    public CatModel[] GetCatBreeds() {
        CatModel[] response = null;
        HttpRequest request = null;
        try {
            request = requestFactory.buildGetRequest(
                    new GenericUrl("https://api.thecatapi.com/v1/breeds"));
            request.setHeaders(headers);

            String json = request.execute().parseAsString();
            response = gson.fromJson(json, CatModel[].class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
