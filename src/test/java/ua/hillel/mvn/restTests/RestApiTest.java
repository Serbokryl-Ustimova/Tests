package ua.hillel.mvn.restTests;

import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class RestApiTest {
    @Test
    public void RestTestGet() throws IOException {
        Request request= new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/user/login")
                .header("username", "name")
                .header("password", "pass")
                .build();

        Response response= new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }
    @Test
    public void RestTestPost()throws IOException {
        String jsonString = "\"id\": 11,\n" +
                "  \"username\": \"Alla1\",\n" +
                "  \"firstName\": \"Alla1\",\n" +
                "  \"lastName\": \"Macron1\",\n" +
                "  \"email\": \"a1@gmail.com\",\n" +
                "  \"password\": \"Alla1\",\n" +
                "  \"phone\": \"2223334414\",\n" +
                "  \"userStatus\": 1";

        RequestBody requestBody = RequestBody.create(jsonString, MediaType.parse("application/json"));

        Request request= new Request.Builder()
                .post(requestBody)
                .url("https://petstore.swagger.io/v2/user")
                .build();

        Response response= new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());



    }
}
