import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList();

        myQueue.add("Kyle");
        myQueue.add("Katelyn");
        myQueue.add("Sinead");
        myQueue.add("Shane");

        System.out.println(myQueue);

        myQueue.poll();

        System.out.println(myQueue);

        System.out.println(myQueue.peek());

        System.out.println(myQueue.size());

        myQueue.add("Kyle");

        

        System.out.println(myQueue.contains("Kyle"));

        System.out.println(myQueue.toArray()[3]);

        System.out.println(myQueue.size());

    }
}
