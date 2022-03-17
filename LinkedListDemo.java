import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> linky = new LinkedList();

        linky.add("Shane");
        linky.add("Kyle");
        linky.add("Katelyn");
        linky.add("Sinead");

        System.out.println(linky.indexOf("Shane"));

        Iterator it = linky.iterator();

        while(it.hasNext()){
            if(it.next() == "Sinead")
                System.out.println("Found Sinead at index " + linky.indexOf("Sinead"));
        }

        for(String name : linky){
            System.out.println(name);
        }
    }
}
