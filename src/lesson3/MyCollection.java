package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class MyCollection {
    public static void main (String[] args) {
        ArrayList<String> moto = new ArrayList<String>();
        moto.add("Yamaha");
        moto.add("Honda");
        moto.add("Suzuki");
        moto.add("KTM");
        moto.add("Kawasaki");
        moto.add("Harley Davidson");
        moto.add("BMW");
        moto.add("Husqvarna");

        //Original list
        System.out.println("Original list is: ");
        Iterator itr = moto.iterator();

        while(itr.hasNext()) {
            String obj = (String)itr.next();
            System.out.println(obj);
        }

        System.out.println();


        //Removing of the element and the following check
        moto.remove(3);

        System.out.println("Is KTM in the list? - " + moto.contains("KTM"));
        System.out.println();

        //List sorting
        Collections.sort(moto);
        System.out.println("Sorting: " + moto);
        System.out.println();

        //Modified list
        System.out.println("Modified list is: ");
        Iterator it = moto.iterator();

        while(it.hasNext()) {
            String obj = (String)it.next();
            System.out.println(obj);
        }

    }
}
