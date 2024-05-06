package HackerRank30DaysChaallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictionaryAndMaps {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
            //   Set<Map.Entry<String, Integer>> entrySet= map.entrySet();


        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        //  break;
        in.close();
    }
}
