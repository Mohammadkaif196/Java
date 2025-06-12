class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

class Ab extends Thread{
 Counter c;
    public Ab(Counter c){
        this.c=c;
    }
    public void run(){
       for(int i=0;i<=50;i++){
         c.increment();
       }
    }
}

class Ba extends Thread{
Counter c;
    public Ba(Counter c){
        this.c=c;
    }
    public void run(){
       for(int i=0;i<=50;i++){
         c.increment();
       }
    }
}

public class ThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Ab t1=new Ab(c);
        Ba t2=new Ba(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
        
    }
}
