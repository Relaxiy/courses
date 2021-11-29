package lesson7.Task2;

public class User {
    private String login;
    private String password;

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}