import java.util.*;

class Elseifexample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number beyond 10 : ");
        int a = sc.nextInt();

        if(a > 10){
            System.out.println("Right Input = " +a);
        }
        else if(a >= 5){
            System.out.println("Range between 5 to 10 = "+a);
        }
        else{
            System.out.println("Input is less than 4 = "+a);
        }
    }
}