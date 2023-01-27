package me.artsafuanov.homeworkproject;

public class User {

    private String login;
    private String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
        if (login.equals(email)) {
            throw new RuntimeException("Логин и e-mail не должны совпадать!");
        }
    }

    public User() {
        }

    public String getLogin() {

        return this.login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public String getEmail() {
        if (email.contains("@") && email.contains(".")) {
            return this.email = email;
        } else {
            throw new RuntimeException("Введен некорректный e-mail!");
        }
    }

    public void setEmail(String email) {

        this.email = email;
    }
}
