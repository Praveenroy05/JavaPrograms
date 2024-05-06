package HackerRank30DaysChaallenge;

public class Day3ConditionalStatement {

    static void solution(int n) {

        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {

            System.out.println("Not Weird");

        } else if (n >= 6 && n <= 20) {

            System.out.println("Weird");

        } else {
            System.out.println("Not Weird");
        }
    }

    public static void main(String[] args) {
        solution(3);

    }
}
