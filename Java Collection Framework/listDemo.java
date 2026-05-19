import java.util.*;

class listDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
