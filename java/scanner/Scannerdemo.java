import java.util.*;

class Scannerdemo{

    public static void main(String[] args){
        System.out.println("This is about Scanner ");
        Scanner sc = new Scanner(System.in);

        //If you give only next() then it will not go for next input

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your marks : ");
        float marks = sc.nextFloat();
        System.out.print("Enter Your Lucky no. : ");
        int num = sc.nextInt();

        System.out.println("Your name is = "+ name);
        System.out.println("Your marks is = "+ marks);
        System.out.println("Your Lucky no. is = "+ num);


    }
}