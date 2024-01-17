package eksamensopgaver.iklassen.userroles;

import java.util.ArrayList;

// 02:08 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Users users = new Users();

        users.createNewUser("Hej", Role.EDITOR);
        users.createNewUser("Børge", Role.ADMIN);
        users.createNewUser("Kirsten", Role.READER);
        users.createNewUser("Karen", Role.EDITOR);

        ArrayList<User> adminUsers = users.getUsersByRole(Role.ADMIN);
        ArrayList<User> editorUsers = users.getUsersByRole(Role.EDITOR);
        ArrayList<User> readerUsers = users.getUsersByRole(Role.READER);

        for (User user : adminUsers) {
            System.out.println(user.getUsername() + ", " + user.getUserID() + ", " + user.getRole());
        }
        for (User user : editorUsers) {
            System.out.println(user.getUsername() + ", " + user.getUserID() + ", " + user.getRole());
        }
        for (User user : readerUsers) {
            System.out.println(user.getUsername() + ", " + user.getUserID() + ", " + user.getRole());
        }

        System.out.println(adminUsers.size());
        System.out.println(editorUsers.size());
        System.out.println(readerUsers.size());
    }
}
