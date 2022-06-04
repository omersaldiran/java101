package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTutorial {
    public static void main(String[] args) {
        List<Integer> Liste = new ArrayList<>();
        Liste.add(10);
        Liste.add(5);
        Liste.add(2);
        Liste.add(78);

        Iterator<Integer> itr = Liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
