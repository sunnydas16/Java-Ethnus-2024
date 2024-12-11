import java.util.*;

class Forloopexample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of loop : ");
        int range = sc.nextInt();

        for(int i = 0;i <= range; i++){
            System.out.println("Series are "+i);
        }
    }
}