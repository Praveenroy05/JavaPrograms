package Programs;//package Programs;
//
//import com.sun.org.apache.xpath.internal.operations.String;
//
//import java.io.*;
//
//public class Result {
//
//    /*
//     * Complete the 'newPassword' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. STRING a
//     *  2. STRING b
//     */
//
//    public static String newPassword(String a, String b) {
//        // Write your code here
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < a.length() || i < b.length(); i++) {
//
//            if (i < a.length()) {
//                result.append()
//            }
//
//        }
//
//    }
//
//
//
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            String a = bufferedReader.readLine();
//
//            java.lang.String b = bufferedReader.readLine();
//
//            String result = Result.newPassword(a, b);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }
//
//

class Test{

    String name;
    int age;

    Test(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {


        Test test1 = new Test("test", 2);
        Test test2 = new Test("test", 2);
        System.out.println(test1==test2);
        System.out.println(test1.equals(test2));


    }



}
