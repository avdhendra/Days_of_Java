package Day4;

public class AnotherThread extends Thread{
    @Override
    public void run(){
        System.out.print("hello from the "+currentThread().getName());
        try{
            Thread.sleep(5000);

        }catch(InterruptedException e){
            System.out.print("Another thread woke me up");
            return;
        }
        System.out.println("Three Second have passed");
    }
}
