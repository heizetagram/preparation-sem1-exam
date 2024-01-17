package eksamensopgaver.iklassen.speedrun2.users;

import java.util.ArrayList;

// 10:21 remaining

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

        users1.getUsers().add(new User("David Lu"));
        users1.getUsers().add(new User("Cim Songe"));

        for (User user : users1.users) {
            System.out.println(user.getFullName() + ", " + user.getUserID());
        }
    }
}
