package eksamensopgaver.iklassen.users;

// 05:01 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        User u1 = new User("David Lu");
        User u2 = new User("Michael Jackson");


        Users users = new Users();
        users.getUsers().add(u1);
        users.getUsers().add(u2);

        for (User user : users.getUsers()) {
            System.out.println(user.getUserID());
        }
    }
}
