package Programs;

public class KangarooJump {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        int k1 = x1;
        int k2 = x2;
        if (x2 > x1 && v2 > v1) {
            //System.out.println("No");
            return "No";

        } else {
                while (k1 != k2){
                k1 = k1 + v1;
                k2 = k2 + v2;
                if (k1 == k2) {
                    return "Yes";
                }
            }
            return "No";
        }
    }

    public static void main(String[] args) {
        String result = kangaroo(0, 3, 4, 2);
        System.out.printf(result);
    }
}
