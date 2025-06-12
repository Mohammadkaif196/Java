// @FunctionalInterface
// interface Java{
//     void learning();
// }

// // without lamda expression 
// // class Student implements Java{
// //     public void learning(){
// //         System.out.println("i am learning java");
// //     }
// // }


// public class LambdaExpression {
//     public static void main(String[] args) {
//          Java obj=
//          //anonymous class
//         //  {
//         //     public void learning(){
//         //          System.out.println("i am learning java");
//         //     }
//         //  };
//         //with lamda express
//         ()->System.out.println("i am learning");
//       obj.learning();
// }
//     }
   


// another example 

@FunctionalInterface
interface Student{
  int opertation(int a,int b);
}

class LambdaExpression{
    public static void main(String[] args) {
        Student obj=(a,b)-> a + b ;
        Student obj2=(a,b)->a * b;
        System.out.println("addition "+obj.opertation(5, 10));
        System.out.println(obj2.opertation(5, 10));

    }
}
