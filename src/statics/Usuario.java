package statics;

public class Usuario {
    static int counter = 0;
    String username;
    String email;

    public Usuario(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Usuario.counter = counter;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
