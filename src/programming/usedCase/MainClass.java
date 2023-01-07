package programming.usedCase;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {


        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(new Name("John", "", "Doe"), new Date(2020, 1, 1)));
        customers.add(new Customer(new Name("Jane", "", "Doe"), new Date(2019, 1, 1)));
        customers.add(new Customer(new Name("John", "", "Smith"), new Date(2018, 1, 1)));
        customers.add(new Customer(new Name("John", "James", "Doe"), new Date(2017, 1, 1)));

        Map<String, Customer> uniqueNames = new HashMap<>();

        // Iterate through the list of customers
        for (Customer customer : customers) {
            // Concatenate the first, middle, and last names to create a unique string
            String name = customer.name.first + customer.name.middle + customer.name.last;
            // If the name is already in the dictionary, check if the current customer has a newer createdDate
            if (uniqueNames.containsKey(name)) {
                Customer existingCustomer = uniqueNames.get(name);
                if (customer.lastUpdated.after(existingCustomer.lastUpdated)) {
                    uniqueNames.put(name, customer);
                }
            }
            // If the name is not already in the dictionary, add it
            else {
                uniqueNames.put(name, customer);
            }
        }

        // Extract the customer objects from the dictionary
        List<Customer> uniqueCustomers = new ArrayList<>(uniqueNames.values());

        // Print the list of unique customers
        System.out.println(uniqueCustomers.toString());
    }
}