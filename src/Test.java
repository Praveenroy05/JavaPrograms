import java.util.*;

interface Interface{

    void bike();
}

abstract class Abstract implements Interface{

    abstract void gear();
}


class Test extends Abstract{

    public void bike(){
        System.out.println("Bike is Running");
    }

    public void gear(){
        System.out.println("Gear Changed");
    }

    public static void main(String args[]){

        Test test = new Test();
        test.bike();
        test.gear();

        String s = new String("String");
        String b = new String("String");
        System.out.println(s.equals(b));
        System.out.println(s==b);

        String a = "meow";
        String ab = a+"deal";
        String abc = "mewodeal";

        System.out.println(a.hashCode());
        System.out.println(ab.hashCode());
        System.out.println(abc.hashCode());
        try {
            System.out.println(ab == abc);
            throw new Throwable();
        }catch (Throwable e){
            System.out.println(e);
        }

        ArrayList<String> al = new ArrayList<>();
        al.add("Tree");
        al.add("Linked");
        al.add("List");
        al.add("Set");

        Iterator<String > itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Tree");
        ll.add("Linked");
        ll.add("List");
        ll.add("Set");
        Iterator i=ll.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes"); //trying duplicate key

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        String name1 = "test";
        String name2 = "test";
        System.out.println(name1==name2);



    }





}