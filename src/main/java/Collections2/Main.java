package Collections2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(20);
        set.add(24);
        set.add(29);
        set.add(25);
        set.add(25623);
        for (Iterator<Integer> it = set.iterator(); it.hasNext(); ) {
            Integer s = it.next();
            //System.out.println(s);
        }

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(2);
        set2.add(20);
        set2.add(24);
        set2.add(29);
        set2.add(25);
        set2.add(25623);
        for (Iterator<Integer> it = set2.iterator(); it.hasNext(); ) {
            Integer s = it.next();
            System.out.println(s);
        }
    }
}
