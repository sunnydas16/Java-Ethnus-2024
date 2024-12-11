import java.util.*;

class Ifexample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number greate than 10 : ");
        int a = sc.nextInt();

        if(a > 10){
            System.out.println("Congralutions no. is = " +a);
        }
        else{
            System.out.println("You Enter Wrong Input");
        }
    }
}