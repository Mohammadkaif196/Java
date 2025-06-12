class A extends Thread{
    public void run(){
        for(int i=0;i<=20;i++){
 System.out.println("One class");
        }
       
    }
}

class B extends Thread{
    public void run(){
         for(int i=0;i<=20;i++){
 System.out.println("Two class");
        }
       
    }
}


public class ThreadsConcept {
    public static void main(String[] args) {
        A o1=new A();
        B o2=new B();
        o1.start();
        o2.start();
    }
}
