public class MyProgramException extends RuntimeException {
    String msg;
    int value;
    int value2;

    public MyProgramException(String msg, int value, int value2) {
        this.msg = msg;
        this.value = value;
        this.value2 = value2;
    }

}
