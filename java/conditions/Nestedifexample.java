import java.util.*;

class Nestedifexample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int x = sc.nextInt();

        if(x>10){
            if(x % 2 == 0){
                System.out.println("Your Number is even "+x);
            }
            else{
                System.out.println("Your number is odd "+x);
            }
        }
        else{
            System.out.println("Wrong Input = "+x);
        }
    }
}