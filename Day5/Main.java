package Day5;

import java.util.Random;
public class Main{
    public static void main(String []args){
        Message message=new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
        
    }
}
//Deadlock occured
//When one thread is locked and dont let the other thread to execute 
/*Dead Lock in java is a part of MutliThreading Deadlock can occur in a situation when a thread is waiting
for an object lock that is acquired by another Thread and Second Thread is waiting for an object lock that is acquired by first thread Since both thread are waiting for each other
to release the lock the condition is called deadlock
*/
class Message {
private String message;
private boolean empty=true;
public synchronized String read() {
    while(empty){
try{
    wait();
}
catch(InterruptedException e){

}
    }
    empty=true;
    notifyAll();
    return message;
}    
public synchronized void write(String message){
    while(!empty){
try{
    wait();
}catch(InterruptedException e){

}
    }
    empty=false;
    this.message=message;
notifyAll();
}
}
class Writer implements Runnable{
    private Message message;
    public Writer(Message message){
        this.message=message;
    }
    public void run(){
        String messages[]={
            "Humpty Dumpty Sat on a wall",
            "Humpty Dumpty had a great fall",
            "All the king horses and all the king's men",
            "Couldnt put humpty together again"
        };
        Random random=new Random();
        for (int i=0;i<messages.length;i++){
            message.write(messages[i]);
            try{
                Thread.sleep(random.nextInt(2000));

            }
            catch(InterruptedException e){

            }
                    }
                    message.write("Finised");

                }
}
class Reader implements Runnable{
    private Message message;
    public Reader(Message messsage){
        this.message=messsage;
    }
    public void run(){
        Random random=new Random();
        for(String latestMessage=message.read();!latestMessage.equals("Finished");latestMessage=message.read()){
            System.out.println(latestMessage);
                try{
                    Thread.sleep(random.nextInt(2000));
                }catch(InterruptedException e){
                    
                }
            
        }
    }
}

//When there are less number of syncronized code block then use notifyall 
//if there are large number of syncro