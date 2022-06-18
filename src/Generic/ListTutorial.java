package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTutorial {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(5);
        liste.add(2);
        liste.add(78);

        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("----------");

        for (Integer element : liste){
            System.out.println(element);
        }

        System.out.println(liste.contains(78));

        List<Integer> liste2 = liste.subList(0,2);
        System.out.println("--------");
        for(Integer a : liste2){
            System.out.println(a);
        }
    }



}
