package eksamensopgaver.iklassen.speedrun2.userroles;

public class User {
    private String username;
    private int userid;
    private static int nextid = 1;
    private Role role;

    public User(String username, Role role) {
        this.username = username;
        this.role = role;
        userid = nextid++;
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
