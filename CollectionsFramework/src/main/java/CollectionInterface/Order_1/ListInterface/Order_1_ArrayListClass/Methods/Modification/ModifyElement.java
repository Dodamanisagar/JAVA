package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Methods.Modification;

import java.util.ArrayList;

public class ModifyElement {
    public static void main(String[] args) {
        //storing only String elements in ArrayList
        ArrayList<String> dataTypes=new ArrayList<>();
        dataTypes.add("integer");
        dataTypes.add("boolean");
        dataTypes.add("char");
        dataTypes.add("float");
        dataTypes.add("byte");
        System.out.println("dataTypes are: "+dataTypes);

        //set(int index, E e) used to set the element at particular index
        dataTypes.set(0,null);
        System.out.println("dataTypes are: "+dataTypes);
    }
}
