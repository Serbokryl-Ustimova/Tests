package ua.hillel.mvn.restTests;

import org.testng.annotations.Test;
import ua.hillel.rest.RestCreateUser;
import ua.hillel.rest.User;

import java.io.IOException;

public class NewRestTest {
    @Test
    public void newRestTest() throws IOException {
        User user = new User();
        user.setId(34);
        user.setUsername("An1na");
        user.setFirstName("An1na");
        user.setLastName("Rak1a");
        user.setEmail("a212@gmail.com");
        user.setPassword("4256");
        user.setPhone("45673283");
        user.setUserStatus(9);

        RestCreateUser restCreateUser =new RestCreateUser();
        restCreateUser.creteUser(user);

        User user1= new RestCreateUser().getUserByUsername("An1na");

    }
}
