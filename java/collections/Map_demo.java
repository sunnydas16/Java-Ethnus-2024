
import java.util.HashMap;
import java.util.Map;

// this is thread safe because of synchronize


class Map_demo{
    public static void main(String[] args){
        Map <String, Integer> stud = new HashMap<>();
        stud.put("sunny",69);
        stud.put("pavan",96);
        stud.put("rishab",88);
        stud.put("seth",100);
        System.out.println(stud.keySet());

        for(String key : stud.keySet()){
            System.out.println(key +":" +stud.get(key));
        }
    }
}