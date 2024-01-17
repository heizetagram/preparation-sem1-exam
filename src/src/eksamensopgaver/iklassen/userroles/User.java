package eksamensopgaver.iklassen.userroles;

public class User {
    private String username;
    private int userID;
    private static int nextID = 1;
    private Role role;

    public User(String username, Role role) {
        userID = nextID++;
        setUsername(username);
        setRole(role);
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
    public int getUserID() {
        return userID;
    }
    public Role getRole() {
        return role;
    }
}
