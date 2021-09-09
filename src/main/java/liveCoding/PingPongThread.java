package liveCoding;

public class PingPongThread extends Thread {

    public static Object lock = new Object();
    private String threadMessage;
    public static volatile String lastStep;

    public PingPongThread(String threadMessage) {
        this.threadMessage = threadMessage;
    }

    @Override
    public void run() {
        while (true) {
            play();
        }
    }

    private void play() {
        synchronized (lock) {
            if (!threadMessage.equals(lastStep)) {
                lastStep = threadMessage;
                System.out.println(threadMessage);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        PingPongThread pingPongThread1 = new PingPongThread("Ping");
        PingPongThread pingPongThread2 = new PingPongThread("Pong");
        pingPongThread1.start();
        pingPongThread2.start();
    }
}
