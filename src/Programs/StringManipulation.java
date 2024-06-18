package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class StringManipulation {

    public static void main(String[] args) {

        String[] x= {"FirstName", "FastName", "Fmace", "Gender", "Address"};

        for( int I =0; I< x.length-1; I++) {
            for (int j = I + 1; j < x.length; j++) {
                if (x[I].charAt(0) > (x[j].charAt(0))) {
                    String temp = x[I];
                    x[I] = x[j];
                    x[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(x));

    }



//            List<String> list= new ArrayList<String>();
//
//        list.add("FirstName");
//            list.add("LastName");
//
//            list.add("Place");
//
//            list.add("Gender");
//            list.add("Address");
//
//
//            for (int i = 0; i < list.size(); i++)
//            {
//                for (int j = i + 1; j < list.size(); j++){
//                    if (list.get(i) > list.get(j)){
//                        String temp = list.get(i);
//                        list.get(i) = list.get(j);
//                        list.get(j) = temp;
//                    }
//
//                }
//            }






    }

