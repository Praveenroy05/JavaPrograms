package javaPractice;

public class ThisKeyword {

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword(1, "Test");
        thisKeyword.displayInfo();
    }

    int id;
    String name;

    ThisKeyword(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println(id +" "+ name);
    }
}
