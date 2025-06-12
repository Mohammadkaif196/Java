class MyBankAccount {
    private int balance=10000;

    public int getBalance(){
            return balance;
    }

    public  synchronized void withdraw(String name, int amount){
           System.out.println(name+ " trying for withdraw of "+amount);
           System.out.println("Checking the Balance ......");
           try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
          if(balance >=amount){
            System.out.println("Processing ...");
             try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance=balance-amount;
        System.out.println(name+" Withdraw successfully");
            
          }else{
             System.out.println("Processing ...");
             try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
             System.out.println(name+" trying to withdaraw But no sufficient Money");
             System.out.println("current Balance is: "+getBalance());
          }
    }
}

class Task extends Thread{
    private MyBankAccount account;
    private String name;
    private int amount;

    public Task(MyBankAccount account,String name,int amount){
        this.account=account;
        this.name=name;
        this.amount=amount;
    }
    public void run(){
       account.withdraw(name,amount);
    }
  
}

public class ThreadSynchronizationInBankAccount {
    public static void main(String[] args) {
        MyBankAccount a=new MyBankAccount();
        Task t=new Task(a,"shaik",6000);
        Task t2=new Task(a,"mohammd",5000);
        t.start();
        t2.start();
        
    }
}
