package eksamensopgaver.iklassen.speedrun3.users;

import java.util.ArrayList;

// 06:52 remaining

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
        users1.getUsers().add(new User("Cay Larsen"));

        for (User user : users1.users) {
            System.out.println(user.getFullName() + ", " + user.getUserID());
        }
    }
}
