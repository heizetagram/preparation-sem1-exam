package eksamensopgaver.iklassen.userroles.take2;

import java.util.ArrayList;

// 04:38 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Users users = new Users();

        users.createUser("Børge", Role.READER);
        users.createUser("Mark", Role.READER);
        users.createUser("John", Role.ADMIN);
        users.createUser("Bob", Role.EDITOR);
        users.createUser("Frederik", Role.ADMIN);
        users.createUser("Henrik", Role.ADMIN);

        ArrayList<User> userAdmins = users.getByRole(Role.ADMIN);
        ArrayList<User> userReaders = users.getByRole(Role.READER);
        ArrayList<User> userEditors = users.getByRole(Role.EDITOR);

        printUsers(userAdmins);
        System.out.println();

        printUsers(userReaders);
        System.out.println();

        printUsers(userEditors);
    }
    private void printUsers(ArrayList<User> users) {
        for (User user : users) {
            System.out.println(user.getUsername() + ", " + user.getUserId() + ", " + user.getRole());
        }
    }

}
