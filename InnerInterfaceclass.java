//need of interface
//with abstract 
// abstract class Computer {
//     public abstract void working();
// }

// class Laptop extends Computer{
//     public void working(){
//         System.out.println("code run test");
//     }
// }
// class Desktop extends Computer{
//     public void working(){
//         System.out.println("fast compile, execute, run");
//     }
// }
// class Employee{
//     public void Dev(Computer lap){
//         lap.working();
//     }
// }
// class Interfaceclass{
//     public static void main(String args[]){
//         Computer lap=new Laptop();
//         Computer des=new Desktop();
//        Employee obj=new Employee();
//        obj.Dev(des);

//     }
// }

//with interface

interface Computer{
    void working();
    }


class Laptop implements Computer{
    public void working(){
        System.out.println("code run test");
    }
}
class Desktop implements Computer{
    public void working(){
        System.out.println("fast compile, execute, run");
    }
}
class Employee{
    public void Dev(Computer lap){
        lap.working();
    }
}
class Interfaceclass{
    public static void main(String args[]){
        Computer lap=new Laptop();
        Computer des=new Desktop();
       Employee obj=new Employee();
       obj.Dev(des);

    }
}