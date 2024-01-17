package eksamensopgaver.iklassen.userroles;

import java.util.ArrayList;

public class Users {
    private ArrayList<User> users;

    public Users() {
        this.users = new ArrayList<>();
    }

    public void createNewUser(String username, Role role) {
        users.add(new User(username, role));
    }

    public ArrayList<User> getUsersByRole(Role role) {
        ArrayList<User> usersByRole = new ArrayList<>();
        for (User user : users) {
            if (user.getRole().equals(role)) {
                usersByRole.add(user);
            }
        }
        return usersByRole;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
