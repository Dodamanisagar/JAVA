package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Methods.Modification;

import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        //storing only String elements in ArrayList
        ArrayList<String> dataTypes=new ArrayList<>();
        dataTypes.add("integer");
        dataTypes.add("boolean");
        dataTypes.add("char");
        dataTypes.add("float");
        dataTypes.add("byte");
        System.out.println("dataTypes are: "+dataTypes);

        //remove(int index) used to remove the elements from particular index
        dataTypes.remove(2);
        System.out.println("dataTypes after removing element from 2 index "+dataTypes);

        //creating another arraylist
        ArrayList arrayList1=new ArrayList();
        arrayList1.add(3);
        arrayList1.add("company");
        arrayList1.add(3.7);
        arrayList1.add('r');
        System.out.println("elements of arrayList1: "+arrayList1);

        //addAll(Collection e) used to add one arrayList elements into another arrayList
        dataTypes.addAll(arrayList1);
        System.out.println("elements of dataTypes after adding arrayList1 elements: "+dataTypes);

        //remove(Object e) used to remove particular Object from arrayList
        dataTypes.remove(3.7);
        System.out.println("elements of dataTypes after removing 3.7 elements: "+dataTypes);

        //retainAll() used to retain the elements
        dataTypes.retainAll(dataTypes);
        System.out.println("dataTypes after retaining"+dataTypes);

        //removeAll(Collection c) used to remove all the elements of another arrayList
        dataTypes.removeAll(arrayList1);
        System.out.println("elements of dataTypes after removing all elements of arrayList1: "+dataTypes);

        //clear() used to clear all the elements from the arrayList
        dataTypes.clear();
        System.out.println("dataTypes after clearing"+dataTypes);




    }
}
