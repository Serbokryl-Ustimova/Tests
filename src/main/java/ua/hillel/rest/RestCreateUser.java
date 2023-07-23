package ua.hillel.rest;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;

public class RestCreateUser {
    public void creteUser(User user) throws IOException {
        Gson gson= new Gson();
        String jsonUser= gson.toJson(user);

        RequestBody requestBody = RequestBody.create(jsonUser, MediaType.parse("application/json"));

        Request postRequest= new Request.Builder()
                .post(requestBody)
                .url("https://petstore.swagger.io/v2/user")
                .build();

        Response response= new OkHttpClient().newCall(postRequest).execute();
    }

    public User getUserByUsername(String username) throws IOException{
        Gson gson= new Gson();

        Request getRequest =new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/user/"+ username)
                .build();


        Response response1= new OkHttpClient().newCall(getRequest).execute();
        User newUser= gson.fromJson(response1.body().string(), User.class);
       return new User();

    }
}
