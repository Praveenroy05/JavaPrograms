package OOPSPart1;

public class CE30Person {

    private String firstName, lastName;

    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setAge(int Age) {
        if (Age < 0 || Age > 100) {

            this.age = 0;
        } else {
            this.age = Age;
        }
        System.out.println(age);
    }


    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;

        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty() || lastName.isEmpty()) {
            return firstName + lastName;
        } else {
            return firstName + " " + lastName;
        }

    }

    public static void main(String[] args) {
        CE30Person person = new CE30Person();
        person.setAge(-5);
        person.setLastName("");
        person.setFirstName("Praveen");
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());

    }


}
