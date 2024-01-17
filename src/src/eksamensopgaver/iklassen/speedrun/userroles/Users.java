package eksamensopgaver.iklassen.speedrun.userroles;

import java.util.ArrayList;

// 09:26 remaining

public class Users {
    private ArrayList<User> users;

    public Users() {
        users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public static void main(String[] args) {
        Users users1 = new Users();

        users1.getUsers().add(new User("heizetagram", Role.ADMIN));
        users1.getUsers().add(new User("IPanda27", Role.EDITOR));
        users1.getUsers().add(new User("David", Role.READER));
        users1.getUsers().add(new User("lee", Role.ADMIN));

        ArrayList<User> admins = users1.getUsersByRole(Role.ADMIN);

        for (User user : admins) {
            System.out.println(user.getUsername() + ", " + user.getUserid() + ", " + user.getRole());
        }
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
}
