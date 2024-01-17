package eksamensopgaver.iklassen.speedrun.users;

import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    public User(String fullName) {
        this.fullName = fullName;
        userID = createUserID();
    }

    private String createUserID() {
        String[] parts = fullName.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            stringBuilder.append(parts[0].charAt(i));
        }
        for (int n = 0; n < 2; n++) {
            stringBuilder.append(parts[1].toLowerCase().charAt(n));
        }
        stringBuilder.append(random.nextInt(10000));

        return stringBuilder.toString();
    }

    public String getFullName() {
        return fullName;
    }
    public String getUserID() {
        return userID;
    }
}
