package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Anagram {
    private final String str;

    Anagram(String str) {
        this.str = str;
    }

    @Override
    public int hashCode() {
        int charSum = 0;
        for (int i = 0; i < str.length(); i++) {
            charSum += str.charAt(i);
        }
        return charSum;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.hashCode() == obj.hashCode());
    }


    public static void main(String[] args) {
        final String[] input = {"abc", "cat", "cba", "test", "sett", "tar", "rat", "pat", "tap", "pta"};
        Map<Anagram, List<String>> processedMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            Anagram cString = new Anagram(input[i]);
            if (processedMap.get(cString) == null) {
                List<String> list = new ArrayList<>();
                list.add(input[i]);
                processedMap.put(cString, list);
            } else {
                processedMap.get(cString).add(input[i]);
            }
        }
        System.out.println(processedMap.values());
    }
}

