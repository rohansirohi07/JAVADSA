import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",120);
        map.put("us",70);
        map.put("china",170);
        System.out.println(map);
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        Set <String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        }

}
