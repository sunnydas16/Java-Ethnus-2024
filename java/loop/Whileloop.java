//when we not have fixed iteration with us
// then we use Whileloop
import java.util.*;

class Whileloop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        

        while(loop < 10){
            System.out.println("while loop hai "+loop);
            loop++;
        }
    }
}