
class A implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
 System.out.println("One class");
        }
       
    }
}

class B implements Runnable{
    public void run(){
         for(int i=0;i<=5;i++){
 System.out.println("Two class");
        }
       
    }
}

public class UsingRunnable {
    public static void main(String[] args) {
            A obj1 = new A();
            B obj2 = new B();
            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);
            t1.start();
            t2.start();
    }
}
