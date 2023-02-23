package Day5;

public class DeadLock {
public static void main(String[] args){
    final String r1="Agrawall";
    final String r2="Jit";
    new Thread(new Runnable() {
        public void run(){
       synchronized (r1){
        System.out.print("Thread1 locked Resource1");
    
    } 
    try {
        Thread.sleep(1000);
    }catch(InterruptedException e){

    }

    
    synchronized(r2){
System.out.print("Thread 2 locked resource2");
    }
        }
    }).start();



    new Thread(new Runnable(){
        public void run(){
synchronized(r2){
System.out.println("Thread Locked 2");
}
try{
    Thread.sleep(100);
}catch(Exception e){

}
synchronized(r1){
    System.out.println("Thread Locked 1");

}
        }
    }).start();
}    
}
/**Avoid Deadlock in java
 * Avoid nested locks
 * Avoid Unecessary locks
 * using thread join
 * 
 * 
 */
