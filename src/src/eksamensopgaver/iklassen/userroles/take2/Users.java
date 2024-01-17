package eksamensopgaver.iklassen.userroles.take2;

import java.util.ArrayList;

public class Users {
    private ArrayList<User> users;

    public Users() {
        users = new ArrayList<>();
    }

    public void createUser(String username, Role role) {
        users.add(new User(username, role));
    }

    public ArrayList<User> getByRole(Role role) {
        ArrayList<User> usersByRole = new ArrayList<>();
        for (User user : users) {
            if (user.getRole().equals(role)) {
                usersByRole.add(user);
            }
        }
        return usersByRole;
    }
}
