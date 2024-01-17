package eksamensopgaver.iklassen.speedrun2.userroles;

import java.util.ArrayList;

// 10:00 remaining

public class Users {
    private ArrayList<User> users;

    public Users() {
        users = new ArrayList<>();
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

    public static void main(String[] args) {
        Users users1 = new Users();

        users1.getUsers().add(new User("David", Role.ADMIN));
        users1.getUsers().add(new User("heizetagram", Role.READER));
        users1.getUsers().add(new User("Lee", Role.EDITOR));
        users1.getUsers().add(new User("Cim", Role.ADMIN));

        ArrayList<User> admins = users1.getUsersByRole(Role.ADMIN);

        for (User user : admins) {
            System.out.println(user.getUsername() + ", " + user.getUserid() + ", " + user.getRole());
        }
    }
}
