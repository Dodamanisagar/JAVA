package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Methods.Modification;

import java.util.ArrayList;

public class AddElements {
    public static void main(String[] args) {
        //creating ArrayList based on initial capacity
        ArrayList arrayList=new ArrayList<>();

        //add() is used to add elements to arraylist
        arrayList.add("sagar");
        arrayList.add(7899123197l);
        arrayList.add(24.5);
        arrayList.add('a');
        System.out.println("elements of arrayList: "+arrayList);

        //add(int index,Collection e) used to add elements in the particu lar index
        arrayList.add(2,"ramesh");
        System.out.println("elements of arrayList after adding at index 2: "+arrayList);

        //creating another arraylist based on the custome capacity
        ArrayList arrayList1=new ArrayList(3);
        arrayList1.add(3);
        arrayList1.add("company");
        arrayList1.add(3.7);
        arrayList1.add('r');
        System.out.println("elements of arrayList1: "+arrayList1);

        //addAll(Collection e) used to add one arrayList elements into another arrayList
        arrayList.addAll(arrayList1);
        System.out.println("elements of arrayList after adding arrayList1 elements: "+arrayList);

        //addAll(int index,Collection e) used to add one arrayList elements into another arrayList from particular index
        arrayList.addAll(3,arrayList1);
        System.out.println("elements of arrayList after adding arrayList1 elements at index position 3:"+arrayList);

    }
}
