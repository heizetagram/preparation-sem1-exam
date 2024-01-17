package throwmyexceptionDontUnderstand;

public class ThrowMyException {
    public static void main(String[] args) throws Exception {
        new ThrowMyException().run();
    }

    private void run() throws Exception {
        int age = 10;
        if (age < 11) {
            throw new MyException("Age must be above 11");
        }
    }
}
