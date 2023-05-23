package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Methods.Query;

import java.util.ArrayList;

public class QueryMethods {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();

        //add() is used to add an Object into the collection
        arrayList.add(10);
        arrayList.add(20.40);
        arrayList.add(10);
        arrayList.add(null);
        arrayList.add("sagar");
        System.out.println("ArrayList Elements are = "+arrayList+"\n");

        //contains() uses equals() to find first occurrence
        System.out.println("ArrayList contains 10:"+arrayList.contains(10)+"\n");

        //size() is used to return the number of objects present inside the collection
        System.out.println("Size of arrayList = "+arrayList.size()+"\n");

        //get() is used to return the Object based on the index position
        System.out.println("Object at index 2 is = "+arrayList.get(2)+"\n");

        //indexOf(Object o) is used to get the index of the first occurrence Element
        System.out.println("index of first occurrence 10 is "+arrayList.indexOf(10)+"\n");

        //lastIndexOf(Object o) is used to get the last index of the Element
        System.out.println("index of last occurrence 10 is "+arrayList.lastIndexOf(10)+"\n");

        //isEmpty() is used to check ArrayList is empty or not
        System.out.println("is arrayList is empty? "+arrayList.isEmpty()+"\n");

        //equals() is used to check whether object is same or not(java.lang package)
        System.out.println("is arrayList is equal to arrayList ? "+arrayList.equals(arrayList)+"\n");

        //subList(int from(including),int to(excluding)) used to get elements from index and excluding to index
        System.out.println("elements from index 0 to 3 are "+arrayList.subList(0,2)+"\n");

        //containsAll(Collection c) is used to check whether one collection contains all the elements of another collection or not
        System.out.println("arrayList contains all the elements of arrayList ? "+arrayList.containsAll(arrayList));

    }
}
