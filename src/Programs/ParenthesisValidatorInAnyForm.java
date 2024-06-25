package Programs;
import java.util.HashMap;
import java.util.Map;
public class ParenthesisValidatorInAnyForm {

    public static void main(String[] args) {
        String input = "}}{}[[[}](}}}]])";

        Map<String, Integer> counts = getCounts(input);

        System.out.println("{} = "+ counts.getOrDefault("{}", 0));
        System.out.println("[] = "+ counts.getOrDefault("[]", 0));
        System.out.println("() = "+ counts.getOrDefault("()", 0));
    }

    public static Map<String, Integer> getCounts(String input) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        map1.put('{', 0);
        map1.put('[', 0);
        map1.put('(', 0);
        map2.put('}', 0);
        map2.put(']', 0);
        map2.put(')', 0);

        for (char ch : input.toCharArray()) {
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            }
        }

        Map<String, Integer> matchingPairs = new HashMap<>();
        matchingPairs.put("{}", Math.min(map1.get('{'), map2.get('}')));
        matchingPairs.put("[]", Math.min(map1.get('['), map2.get(']')));
        matchingPairs.put("()", Math.min(map1.get('('), map2.get(')')));

        return matchingPairs;
    }
}
