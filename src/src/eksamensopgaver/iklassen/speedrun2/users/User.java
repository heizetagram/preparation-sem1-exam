package eksamensopgaver.iklassen.speedrun2.users;

import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    public User(String fullName) {
        this.fullName = fullName;
        createUserID();
    }

    private void createUserID() {
        String[] parts = fullName.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        stringBuilder.append(parts[0].substring(0, 2));
        stringBuilder.append(parts[1].substring(0, 2).toLowerCase());
        stringBuilder.append(random.nextInt(10000));

        userID = stringBuilder.toString();
    }

    public String getFullName() {
        return fullName;
    }
    public String getUserID() {
        return userID;
    }
}
