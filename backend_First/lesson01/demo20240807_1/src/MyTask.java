public class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("~MyTread 2 start");

        for (int i = 1000; i < 1010; i++) {
            System.out.println("~MyThread 2:" + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("~MyTread 2 finish");
    }
}
