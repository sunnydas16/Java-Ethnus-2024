import java.util.*;

class Switchexample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int w = sc.nextInt();
// if we remove ( break; ) then it will 
// execute all the program until another break or default 
        switch(w){
            case 1: 
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thuresday");
                break;
            case 6:
                System.out.println("friday");
                break; 
            case 7:
                System.out.println("Saturday");
                break; 
            default:
                System.out.println("Invalid Input "+w); 
        }
    }
}