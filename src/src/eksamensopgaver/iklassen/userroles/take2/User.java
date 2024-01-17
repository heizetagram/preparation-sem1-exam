package eksamensopgaver.iklassen.userroles.take2;

public class User {
    private String username;
    private int userId;
    private static int nextId = 1;
    private Role role;

    public User(String username, Role role) {
        setUsername(username);
        setRole(role);
        userId = nextId++;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }
    public int getUserId() {
        return userId;
    }
    public Role getRole() {
        return role;
    }
}
