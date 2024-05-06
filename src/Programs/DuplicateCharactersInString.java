package Programs;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {
    public static void duplicateCharCount(String inputString) {


        //Creating a HashMap containing char as key and it's occurrences as value

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        //Converting given string to char array

        char[] strArray = inputString.toCharArray();

        //checking each char of strArray

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
        //If char is present in charCountMap, incrementing it's count by 1

                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {

        //If char is not present in charCountMap,
        //putting this char to charCountMap with 1 as it's value

                charCountMap.put(c, 1);
            }
        }
        //Getting a Set containing all keys of charCountMap

        Set<Character> charsInString = charCountMap.keySet();

        System.out.println("Duplicate Characters In " + inputString);

        //Iterating through Set 'charsInString'
        for (char ch : charsInString)

            if (charCountMap.get(ch) > 1) {
        //If any char has a count of more than 1, printing it's count

                System.out.println(ch + " : " + charCountMap.get(ch));
            }
    }

    public static void dupChar(String input){

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i=0; i<input.length(); i++){
            if(hashMap.containsKey(input.charAt(i))){
                hashMap.put(input.charAt(i), hashMap.get(input.charAt(i))+1);
            }else {
                hashMap.put(input.charAt(i),1);
            }
        }
        Set<Character> charSet = hashMap.keySet();
        for(char c: charSet) {
                if (hashMap.get(c) == 1) {
                    System.out.print(c);
                }else {
                    System.out.print(c + "" + hashMap.get(c));
                }
        }
    }


    public static void main(String[] args) {
        duplicateCharCount("JavaJ2EE");
        duplicateCharCount("Fresh Fish");

        duplicateCharCount("Better Butter");
        dupChar("JavaJ2EE");
    }
}

