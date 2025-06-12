class A extends Thread {
    public void run() {
        for (int i = 0; i <= 15; i++) {
            System.out.println("One class");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 15; i++) {
            System.out.println("Two class");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        // System.out.println(obj1.getPriority()); // to get the priority of the thread;
        // System.out.println( obj2.getName()); // to get thread name
        // System.out.println(obj1.getState());
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority()); // 0 -least priority and 10- max priority
        obj1.start();
        obj2.start();

    }
}
