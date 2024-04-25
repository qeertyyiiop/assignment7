package Part2;

import java.util.List;

public class User {
    private String username;
    private String password;
    private List<String> permissions;

    public User(String username, String password, List<String> permissions) {
        this.username = username;
        this.password = password;
        this.permissions = permissions;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}

