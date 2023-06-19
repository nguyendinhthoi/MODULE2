package ss12_java_collection_framework.exercise.tree_map;


import java.util.Arrays;
import java.util.Map;
import java.util.Set;


public class TreeMap {
    public static void main(String[] args) {


        Map<String, Integer> stringMap = new java.util.TreeMap<>();

        String string = "You are beautiful" +
                " What your name" +
                " You are a apple in my eyes ";
        String value = string.toLowerCase();
        String[] value1 = value.split(" ");

        System.out.println(Arrays.toString(value1));
        for (String s : value1) {
            if (stringMap.containsKey(s)) {
                stringMap.put(s, stringMap.get(s) + 1);
            } else {
                stringMap.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : stringMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " 'appear' " + stringIntegerEntry.getValue() + " times");
        }
    }
}
