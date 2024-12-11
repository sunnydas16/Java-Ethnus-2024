import java.io.File;
import java.io.FileNotFoundException;
// import java.io.* to import all things to avoid mistakes;
import java.util.*;

class Readfileexample{
    public static void main(String[] args) throws FileNotFoundException{
       
        File file = new File("input.txt");

        Scanner sc = new Scanner(file);
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}