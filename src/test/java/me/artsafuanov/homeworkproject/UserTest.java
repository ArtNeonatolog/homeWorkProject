package me.artsafuanov.homeworkproject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTest {
    @Test
    public void testUserConstructorWithParameters() {
        final String login = "login";
        final String email = "login@mail.com";

        User user = new User(login, email);

        String userLogin = user.getLogin();
        String userEmail = user.getEmail();

        assertNotNull(userLogin, userEmail);
    }

    @Test
    public void testUserConstructorWithoutParameters() {

        User user = new User();

        assertNotNull(user);
    }

    @Test
    public void testUserLoginAndEmailEquals() {
        final String login = "login";
        final String email = "login@mail.com";

        User user = new User(login, email);

        String userLogin = user.getLogin();
        String userEmail = user.getEmail();

        assertNotEquals(userLogin, userEmail);
    }
}
