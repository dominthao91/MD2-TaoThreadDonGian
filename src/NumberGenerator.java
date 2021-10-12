public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 9; i++) {
                System.out.println(i);
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator1 = new NumberGenerator();
        Thread thread =new Thread(numberGenerator);
        Thread thread1 =new Thread(numberGenerator1);
        thread.start();
        thread1.start();
    }
}
