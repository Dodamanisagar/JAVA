package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Methods.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ItaratorMethods {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();

        //add() is used to add an Object into the collection
        arrayList.add(10);
        arrayList.add(20.40);
        arrayList.add(10);
        arrayList.add(null);
        arrayList.add("sagar");
        System.out.println("ArrayList Elements are = "+arrayList+"\n");

        //List can return iterator()
        System.out.println("iterating using Iterator:-");
        Iterator<ArrayList> iterator=arrayList.iterator();
        while (iterator.hasNext())//hasNext() returns boolean value indicating whether iterator can access more value
        {
            System.out.println(iterator.next());//next() accesses and returns next values
        }

        //List can return listIterator()
        System.out.println();
        System.out.println("iterating using ListIterator:-");
        ListIterator<ArrayList> listListIterator=arrayList.listIterator();
        while (listListIterator.hasNext())//hasNext() returns boolean value indicating whether iterator can access more value
        {
            System.out.println(listListIterator.next());//next() accesses and returns next values
        }

        //List can return listIterator( int index )
        System.out.println();
        System.out.println("iterating using ListIterator:-");
        ListIterator<ArrayList> listListIteratorindex=arrayList.listIterator(2);
        while (listListIteratorindex.hasNext())//hasNext() returns boolean value indicating whether iterator can access more value
        {
            System.out.println(listListIteratorindex.next());//next() accesses and returns next values
        }
    }
}
