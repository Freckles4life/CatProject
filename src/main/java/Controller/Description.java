package Controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Description {

        private static HttpURLConnection connection;

        public static void main(String[] args)  {
            BufferedReader reader;
            String line;
            StringBuffer responseContent = new StringBuffer();
            try{
                URL url = new URL("https://api.thecatapi.com/v1/breeds");
                connection = (HttpURLConnection) url.openConnection();


                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);

                int status = connection.getResponseCode();


                if (status >299) {
                    reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                    while ((line = reader.readLine()) != null) {
                        responseContent.append(line);
                    }
                    reader.close();
                }else {
                    reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    while ((line= reader.readLine())!=null){
                        responseContent.append(line);
                    }
                    reader.close();
                }
                //System.out.println(responseBody.toString());
                parse(responseContent.toString());

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                connection.disconnect();
            }}

        public static String parse (String responseBody){
            JSONArray breeds = new JSONArray(responseBody);
            for (int i = 0; i < breeds.length(); i++) {
                JSONObject breed = breeds.getJSONObject(i);
                String id = breed.getString("id");
                String breeed = breed.getString("name");
                String description = breed.getString("description");
                String temperament = breed.getString ("temperament");
                System.out.println(id + "       " + breeed + "                " + description +    "       "  + temperament);

            }
            return null;
        }}





