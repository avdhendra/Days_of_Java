package Day4;

public class MutliThreading {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();
        CountdownThread t1 = new CountdownThread(countDown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countDown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class CountDown {
    public void doCountDown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_RED;

        }

        for (int i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
        }

    }
}

class CountdownThread extends Thread {
    private CountDown threadCountDown;

    public CountdownThread(CountDown countdown) {
        threadCountDown = countdown;
    }

    @Override
    public void run() {
        threadCountDown.doCountDown();
    }
}
//Two Thread cant access each other memory variable but they can access the heap variable 
//Local variable stored in the thread stack means each thread has a copy of local variable in their stack
//thread shared the heap so instanced variable shared between thread

