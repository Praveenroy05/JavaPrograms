package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    // String array[]= new String[]{"Pune", "Mumbai", "987", "9876", "hagsd", "ad", "345"};


    public static void getArray() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("178");
        al.add("10");
        al.add("Superb");
        Collections.sort(al);
        System.out.println(al);

    }

    public static void main(String[] args) {
        getArray();
    }


}
