package ua.hillel.rest;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;

public class RestCreateOrder {
    public void creteOrder(Order order) throws IOException {
        Gson gson = new Gson();
        String jsonOrder = gson.toJson(order);

        RequestBody requestBody = RequestBody.create(jsonOrder, MediaType.parse("application/json"));

        Request postRequest = new Request.Builder()
                .post(requestBody)
                .url("https://petstore.swagger.io/v2/store/order")
                .build();

        Response response = new OkHttpClient().newCall(postRequest).execute();
    }

    public Order getOrderById(int id) throws IOException {
        Gson gson = new Gson();

        Request getRequest = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/store/order/" + id)
                .build();


        Response response = new OkHttpClient().newCall(getRequest).execute();
        Order newOrder = gson.fromJson(response.body().string(), Order.class);
        return new Order();

    }

    public Order deleteOrderById(int id) throws IOException {
        Gson gson = new Gson();


        Request deleteRequest = new Request.Builder()
                .delete()
                .url("https://petstore.swagger.io/v2/store/order/" + id)
                .build();

        Response response = new OkHttpClient().newCall(deleteRequest).execute();
        Order newOrder = gson.fromJson(response.body().string(), Order.class);
        return new Order();
    }

    public Order getInventory() throws IOException {
        Gson gson = new Gson();

        Request getInventoryRequest = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/store/inventory")
                .build();


        Response response = new OkHttpClient().newCall(getInventoryRequest).execute();
        Order newInventory = gson.fromJson(response.body().string(), Order.class);
        return new Order();

    }
}