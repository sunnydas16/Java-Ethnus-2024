import java.util.*;

class Dowhileloop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number less than 10 for loop : ");
        int dwl = sc.nextInt();

        do{
            System.out.println("My name is Sunny");
            dwl++;
        }while(dwl<10);
    }
}