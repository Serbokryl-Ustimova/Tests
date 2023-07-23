package ua.hillel.mvn.restTests;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;

public class JsonRestTest {
    @Test
    public void jsonTest() throws IOException, IllegalArgumentException {
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("id", "1");
        jsonObject.put("username", "Cinderella");
        jsonObject.put("firstName", "Cinderella");
        jsonObject.put("lastName", "James");
        jsonObject.put("email", "Cinderella@gmail.com");
        jsonObject.put("password", "Cinderella");
        jsonObject.put("phone", "111222333");
        jsonObject.put("userStatus", "1");


        RequestBody requestBody = RequestBody.create(jsonObject.toString(), MediaType.parse("application/json"));

        Request request= new Request.Builder()
                .post(requestBody)
                .url("https://petstore.swagger.io/v2/user")
                .build();

        Response response= new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        String s= response.body().string();
        System.out.println(s);
        JSONObject responseObject= new JSONObject(s);
        System.out.println(responseObject.get("code"));
    }
}
