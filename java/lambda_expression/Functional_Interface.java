// this Functional interface 
//  only one method in the interface.  
// if more than one interface then it is not functional interface

interface A{
    void show();
}
// class B implements A{
//     public void show(){
//         System.out.println("this is b class");
//     }
// }

class Functional_Interface{
    public static void main(String[] args){
        A obj = new A(){
            public void show(){
                System.out.println("This is ananoymus class");
            }
        };
        // A obj = new A();
        // A obj = new B();
        obj.show();
    }

}
