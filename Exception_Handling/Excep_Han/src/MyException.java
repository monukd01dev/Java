public class MyException extends Exception {
    final String msg;

    public MyException(String msg) {
        this.msg=msg;
    }

    public String toString() {
        return msg;
    }
}
