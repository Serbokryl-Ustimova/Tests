package ua.hillel.mvn.restTests;

import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;

public class SerRestTest {
    @Test
    public void serRestTest() throws IOException {
        User user= new User();
        user.setId(34);
        user.setUsername("Anna");
        user.setFirstName("Anna");
        user.setLastName("Raka");
        user.setEmail("a21@gmail.com");
        user.setPassword("456");
        user.setPhone("4567383");
        user.setUserStatus(8);

        Gson gson= new Gson();
        String jsonUser= gson.toJson(user);

        System.out.println(jsonUser);

        RequestBody requestBody = RequestBody.create(jsonUser, MediaType.parse("application/json"));

        Request postRequest= new Request.Builder()
                .post(requestBody)
                .url("https://petstore.swagger.io/v2/user")
                .build();

        Response response= new OkHttpClient().newCall(postRequest).execute();
//        System.out.println(response.code());
        String s= response.body().string();
//        System.out.println(s);

        Request getRequest =new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/user/Anna")
                .build();

        Response response1= new OkHttpClient().newCall(getRequest).execute();
//        System.out.println(response1.code());
        String v = response1.body().string();
        JSONObject responseObject1= new JSONObject(v);
//        System.out.println(responseObject1.get("userStatus"));

        User newUser =gson.fromJson(v, User.class);
        System.out.println(newUser);
    }
    private static class User{
        private int id;
        private String username;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String phone;
        private int userStatus;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getUserStatus() {
            return userStatus;
        }

        public void setUserStatus(int userStatus) {
            this.userStatus = userStatus;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", phone='" + phone + '\'' +
                    ", userStatus=" + userStatus +
                    '}';
        }
    }
}
