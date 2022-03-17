import java.net.StandardSocketOptions;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack();

        myStack.push(35);
        myStack.push(41);
        myStack.push(7);
        myStack.push(4);

        System.out.println(myStack);

        myStack.pop();



        System.out.println(myStack);

        int indexPos = myStack.search(7);
        System.out.println(indexPos);

        ListIterator<Integer> myIterator = myStack.listIterator();

        while(myIterator.hasNext()) System.out.println(myIterator.next());

        while(myIterator.hasPrevious()) System.out.println(myIterator.previous());

    }
}
