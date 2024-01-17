package eksamensopgaver.iklassen.speedrun.users;

import java.util.ArrayList;

//06:18 remaining

public class Users {
    private ArrayList<User> users;

    public Users() {
        users = new ArrayList<>();
    }
    public ArrayList<User> getUsers() {
        return users;
    }

    public static void main(String[] args) {
        Users users = new Users();

        users.getUsers().add(new User("Kim Son"));
        users.getUsers().add(new User("David Lu"));

        for (User user : users.getUsers()) {
            System.out.println(user.getFullName() + ", " + user.getUserID());
        }
    }
}
