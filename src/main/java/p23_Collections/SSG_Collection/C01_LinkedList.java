package p23_Collections.SSG_Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        List<Integer> ll2 = new LinkedList<>();
        Deque<Integer> ll3 = new LinkedList<>();
        Queue<Integer> ll4 = new LinkedList<>();

        ll2.add(1);

        //  ll2.add(3);
        //  ll2.add(4);
        //  ll2.add(5);
        //  ll2.add(2,6);
        //  System.out.println(ll2);
        //  System.out.println(ll2.remove((Object)2));
        //  System.out.println(ll2);

        //  ll4.add(1);
        //  ll4.add(2);
        //  ll4.add(3);
        //  ll4.add(4);
        //  ll4.add(5);
        //  System.out.println(ll4);
        //  ll4.remove();
        //  System.out.println(ll4);

        ll3.add(2);
        ll3.add(3);
        ll3.add(4);
        ll3.add(5);
        ll3.addFirst(1);
        System.out.println(ll3);
        ll3.removeFirst();
        ll3.removeLast();
        System.out.println(ll3);

        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.add(5);
        ll1.add(0, 1);
        ll1.addFirst(0);
        System.out.println(ll1);
        ll1.remove();
        System.out.println(ll1);

    }
}
