package eksamensopgaver.iklassen.users;

import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    public User(String fullName) {
        setFullName(fullName);
        createUserID();
    }

    private void createUserID() {
        userID = "";
        Random random = new Random();
        String[] parts = fullName.split(" ");
        userID += parts[0].substring(0, 2);
        userID += parts[1].substring(0, 2);
        userID += random.nextInt(9999);
    }

    public String getUserID() {
        return userID;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
