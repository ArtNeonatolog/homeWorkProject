package me.artsafuanov.homeworkproject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void testUserConstructorWithParameters() {
        String login = "login";
        String email = "login@mail.com";

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
        final String login = "login@mail.com";
        final String email = "login@mail.com";

        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> new User(login, email));
        assertTrue(thrown.getMessage().contentEquals("Логин и e-mail не должны совпадать!"));
    }

    @Test
    public void testEmailContains() {

        String login = "login";
        String email = "login@mail.com";

        User user = new User(login, email);

        String userEmail = user.getEmail();
        if (userEmail.contains("@") && userEmail.contains(".")){
            assertSame(userEmail, user.getEmail());
        }
    }
}
