package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Methods.Miscellaneous;

import java.util.ArrayList;

public class MiscellaneousMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();

        //add() is used to add an Object into the collection
        arrayList.add("10");
        arrayList.add("20");
        arrayList.add("30");
        arrayList.add("50");
        arrayList.add("40");
        System.out.println("ArrayList Elements are = "+arrayList+"\n");

        //hashcode() returns hashcode of the object
        System.out.println("hashcode of arrayListis = "+arrayList.hashCode()+"\n");

        //toArray() is used to convert the collection into Array
        Object[] values= arrayList.toArray();
        System.out.println("array elements using toArray() are:");
        for (Object str:values
             ) {
            System.out.println(str);

        }

        //toArray(T[] t) It is used to return an array containing all of the elements in this list in the correct order
        System.out.println();
        String[] getarray = new String[arrayList.size()];
        getarray = arrayList.toArray(getarray);
        System.out.println("array elements using toArray(T[] t) are:");
        for(String str : getarray)
        {
            System.out.println(str);
        }


    }
}
