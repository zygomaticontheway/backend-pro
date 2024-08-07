public class MyThread1 extends Thread {

    private int start;
    private int end;

    public MyThread1(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("___MyTread 1 start");

        for (int i = start; i < end; i++) {
            System.out.println("___MyThread 1:" + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("___MyTread 1 finish");
    }
}
