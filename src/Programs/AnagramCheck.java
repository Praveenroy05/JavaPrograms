package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AnagramCheck {


    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count frequency of characters in str1
        for (char c : str1.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Decrement frequency for characters in str2
        for (char c : str2.toCharArray()) {
            if (!charFrequency.containsKey(c)) {
                return false; // character not present in str1
            }
            charFrequency.put(c, charFrequency.get(c) - 1);
            if (charFrequency.get(c) == 0) {
                charFrequency.remove(c); // remove if frequency becomes 0
            }
        }

        // If the map is empty, it means all characters have been used up
        return charFrequency.isEmpty();
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of characters in str1
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Decrement the counts for characters in str2
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                // Character not present in str1, not an anagram
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        // Check if all character counts are zero
        for (int count : charCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean areAnagram(String str1, String str2) {
        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Remove non-alphabetic characters
    //    str1 = str1.replaceAll("[^a-z]", "");
      //  str2 = str2.replaceAll("[^a-z]", "");

        // Check if the length of both strings is equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listenn";
        String str2 = "silentn";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        if (areAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " is anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " is not anagrams.");
        }
    }

}

