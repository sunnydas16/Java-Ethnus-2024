// lambda interface is a way to implement a functional interface 
//a functional interface is having only one abstract class
// and it can be implemented using a lambda epression

interface A{              //only one method in because of functional interface
   // void show();
   // void show(int i);
   void show(int i,int j); 
}

class Lambda_Expression1{
    public static void main(String[] args) {
        // A obj = () -> System.out.println("in show"); //one statement to print thats why no curley braces
        // obj.show();

        A ob = (int i,int j) -> System.out.println("number : "+i +" "+j);
        ob.show(69,96);
             // A ob = ( i, j) -> System.out.println("number : "+i +" "+j);     same like line 16&17
             // ob.show(69,96);
            
        
    }
}