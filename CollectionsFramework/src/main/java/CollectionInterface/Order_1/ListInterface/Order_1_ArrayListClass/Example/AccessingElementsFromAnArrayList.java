package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Example;

import java.util.ArrayList;
import java.util.List;

public class AccessingElementsFromAnArrayList {
    /**This example shows:
     How to check if an ArrayList is empty using the isEmpty() method.
     How to find the size of an ArrayList using the size() method.
     How to access the element at a particular index in an ArrayList using the get() method.
     How to modify the element at a particular index in an ArrayList using the set() method.*/
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);

        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        // Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
