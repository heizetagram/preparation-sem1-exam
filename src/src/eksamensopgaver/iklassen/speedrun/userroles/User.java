package eksamensopgaver.iklassen.speedrun.userroles;

public class User {
    private String username;
    private int userid;
    private static int nextId = 1;
    private Role role;

    public User(String username, Role role) {
        this.username = username;
        userid = nextId++;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }
    public int getUserid() {
        return userid;
    }
    public Role getRole() {
        return role;
    }
}
