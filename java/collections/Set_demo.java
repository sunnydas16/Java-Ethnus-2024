
import java.util.*;

class Set_demo{
    public static void main(String[] args) {
        Set <Integer> s = new HashSet<Integer>();

        s.add(22);
        s.add(61);
        s.add(76);
        s.add(14);

        for(int n:s){
            System.out.println(n);
        }
    }} 