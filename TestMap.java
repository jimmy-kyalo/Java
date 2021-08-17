import java.util.*;

public class TestMap {

    public static void main(String[] args) {
        // create a hashmap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Sarah", 30);
        hashMap.put("Ann", 31);
        hashMap.put("Lydia", 29);
        hashMap.put("Carol", 29);

        System.out.println("Display entries in Hashmap");
        System.out.println(hashMap + "\n");

        // create tree  map from preceding hashmap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order od key");
        System.out.println(treeMap);

        // create a linkedhashmap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        linkedHashMap.put("Sarah", 30);
        linkedHashMap.put("Ann", 31);
        linkedHashMap.put("Lydia", 29);
        linkedHashMap.put("Carol", 29);

        // display the age for lydia
        System.out.println("\nThe age for Lydia is " + linkedHashMap.get("Lydia"));

        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap);

        // display each entry eith name and age
        System.out.println("\nNames and ages are ");
        treeMap.forEach((name, age) -> System.out.println(name + ": " + age + " "));
    }
}