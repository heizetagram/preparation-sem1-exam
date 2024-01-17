package throwmyexceptionDontUnderstand;

public class MyException extends Exception {

    public MyException(String string) throws Exception {
        throw new Exception(string);
    }

    @Override
    public String toString() {
        return "Jeg siger:";
    }
}
