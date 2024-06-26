package HackerRank30DaysChaallenge;

import java.util.Scanner;


    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    class Student extends Person {
        private int[] testScores;
        int size=0;

        Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores= testScores;
             size= testScores.length;
        }



        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here


        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here
        public char calculate() {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += testScores[i];

            }
            if ((sum / size) >= 90) {
                return 'o';
            } else if ((sum / size) >= 80) {
                return'e';
            } else if ((sum / size) >= 70) {
                return 'a';
            } else if ((sum / size) >= 55) {
                return 'p';
            } else if ((sum / size) >= 40) {
                return 'd';
            } else {
                return 't';
            }

        }
    }

        public class Day12Inheritance {

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String firstName = scan.next();
                String lastName = scan.next();
                int id = scan.nextInt();
                int numScores = scan.nextInt();
                int[] testScores = new int[numScores];
                for (int i = 0; i < numScores; i++) {
                    testScores[i] = scan.nextInt();
                }
                scan.close();

                Student s = new Student(firstName, lastName, id, testScores);
                s.printPerson();
                System.out.println("Grade: " + s.calculate());
            }
        }



