package Day4;
/**
 * A Thread is a Unit of execution within a process each process can have mutliple threads.In
 * java every process(or appplication) has at least one thread the main thread(for UI application this called the JavaFX application thread)
 * about every java process also has mutliple system thread that handle tasks like memory mamn
 * 
 * Concurrency means that one task doesnt have to complete before another can start
 */
public class ThreadBasic {
    public static void main(String[] args){
        System.out.println("Bro Hello");
       //Method 1
        Thread anoThread=new AnotherThread();
        anoThread.start(); //it enable jvm to run the run method
        System.out.println("kki");

//Method 2
new Thread(){
    public void run(){
        System.out.print("asasas");
    }
}.start();

//Method 3
Thread myRunnablThread=new Thread(new MyRunnable());
myRunnablThread.start();

Thread myRun=new Thread(new MyRunnable(){
    @Override
    public void run(){
        System.out.println("Hello from the anonymous class implementation of run()");
        try{
            //join another thread to my run thread
           //anoThread.join(2000)// wait for two second we get return from the thread that ok other wise it is terminated because of time out
            anoThread.join(); //wait for 3 second 
            System.out.println("Another Thread terminated,or im timeout so Im running again");
        }
        catch(InterruptedException e){
            System.out.println("i Couldnt wait after all I was Interrupted");
        }
    }
});
myRun.start();

//When we invoke the join() method on a thread the calling thread goes into a waiting state it remain in a waiting state until
//the referenced thread terminated
/**
 * The join() method may also return if the referenced thread is interrupted in this case the method throws
 * and InterruptedException
 * if the referenced thread was already terminated or hasnt been started the call to join method returns immediately
 * 
 * 
 * 
 * Thread.join() method with timeout
 * The join method will keep waiting if the referenced thread is blocked or takes too long to process this can become and
 * issue as the calling thread will become non-responsive to handle these situation we use overloaded version of the join method that allow
 * us to specify a timeout period
 * 
 * 
 * 
 */




    }



}
