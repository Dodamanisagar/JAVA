package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.AboutArrayList;

public class AboutArrayList {
    /**ArrayList:-
     --->It is predefined class present in java.util package.
     --->it is introduced from JDK 1.2
     --->Since ArrayList is implementing List interface all specifications of List interface is followed by arrayList as well.
     --->The initial capacity of ArrayList is 10.
     --->the Incremental capacity of ArrayList is :
         Incremental_capacity=((current_capacity*3)/2)+1
     --->The underlined data Structure (Internal data structure) of ArrayList is "Resizable array"/"Growable array".

     *Working Of ArrayList:-
     --->When we create an Object of ArrayList internally a new array gets created based on the initial capacity or custom capacity.
     --->We make use of add() to add an elements into Collection.
     --->Once the ArrayList is full, and we still add an elements then a new array will get created based on the incremental capacity formula.
     --->The elements from the old array gets copied into the newly created array.
     --->The reference variable pointing to the old array gets de-referred and starts pointing to the newly created array.

     *ArrayList implements the following Interface:-
     1)List
     2)RandomAccess
     3)Cloneable
     4)Serializable
     * */
}
