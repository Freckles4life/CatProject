package Controller;

import com.google.api.client.json.JsonParser;
import org.json.JSONObject;
import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) throws IOException, InterruptedException {
        try {
         URL url = new URL("https://api.thecatapi.com/v1/breeds");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("x-api-key","efd87722-3488-4958-9d0c-8e980aee9759");
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder inline = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext())
                    inline.append(scanner.nextLine());

                scanner.close();

//place to add...
                }

} catch (ProtocolException protocolException) {
            protocolException.printStackTrace();
        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    } ;}


             //OPTIONAL//
               /* HttpRequest requestBreeds = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.thecatapi.com/v1/breeds"))
                    .header("x-api-key", "efd87722-3488-4958-9d0c-8e980aee9759")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String > response = HttpClient.newHttpClient().send(requestBreeds, HttpResponse.BodyHandlers.ofString())
            System.out.println(response.body());
            JsonParser parser = new JSONParser() {
            JSONObject data = (JSONObject) parser.parse(response.body());
*/