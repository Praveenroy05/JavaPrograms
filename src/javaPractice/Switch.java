package javaPractice;

public class Switch {

    public static void main(String[] args) {
        switchCaseString("Thursday");
        switchCaseInteger(-8);

        int i=1;
        while(i<=10){
            if(i==5){
                //using break statement
                break;//it will break the loop
            }
            System.out.println(i);
            i++;
        }

}

    public static void switchCaseString(String day){

        switch (day){
            case "Monday":
                System.out.println("It is Monday");
                break;

            case "Tuesday":
                System.out.println("It is Tuesday");
                break;

            case "Wednesday":
                System.out.println("It is Wednesday");
                break;

            case "Thursday":
                System.out.println("It is Thursday");
                break;

            case "Friday":
                System.out.println("It is Friday");
                break;

            case "Saturday":
                System.out.println("It is Saturday");
                break;

            case "Sunday":
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }

        System.out.println(day);



    }

    public static void switchCaseInteger(int number){

        switch (number){
            case 0:
                System.out.println("It is Zero");
                break;

            case 1:
                System.out.println("It is One");
                break;

            case 2:
                System.out.println("It is Two");
                break;

            case 3:
                System.out.println("It is Three");
                break;

            case 4:
                System.out.println("It is Four");
                break;

            case 5:
                System.out.println("It is Five");
                break;

            case 6:
                System.out.println("It is Six");
                break;
            default:
                System.out.println("Number is less than 0 or greater than 6");

        }
        System.out.println(number);



    }
}
