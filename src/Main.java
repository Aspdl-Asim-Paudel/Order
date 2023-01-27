//create a similar multilevel inheritence including Models.MainCategory, Models.Category And Items where Models.Category is child class of Models.MainCategory and Items is child class of Items  and also make class Models.Order and class Models.Customer where customer class is inside order and order should have array list of item .
//Make a Main class where we can access customer and make a method to print the bill when the name of the customer is inserted it must generate his bill.
//Models.Item should have get item detail which should give info about its category and Main category use construtors for all the classes and add properties to each of them.

import Models.Customer;
import Models.Item;
import Models.MainCategory;
import Models.Order;
import jdk.jfr.Category;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MainCategory food = new MainCategory("Food");
        MainCategory drinks = new MainCategory("Drinks");

        Category appetizers = new Category(food, "Appetizers");
        Category entrees = new Category(food, "Entrees");
        Category desserts = new Category(food, "Desserts");

        Category beer = new Category(drinks, "Beer");
        Category wine = new Category(drinks, "Wine");
        Category cocktails = new Category(drinks, "Cocktails");

        Item item1 = new Item("Nachos", appetizers, 8.99);
        Item item2 = new Item("Steak", entrees, 19.99);
        Item item3 = new Item("Chocolate Cake", desserts, 5.99);
        Item item4 = new Item("IPA", beer, 6.99);
        Item item5 = new Item("Chardonnay", wine, 9.99);
        Item item6 = new Item("Margarita", cocktails, 11.99);

        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);

        Customer customer = new Customer("John Smith", "123 Main St");
        Order order = new Order(customer, items);

        printBill(order, "John Smith");
    }

    public static void printBill(Order order, String customerName) {
        if (order.getCustomer().getName().equals(customerName)) {
            System.out.println("Customer: " + order.getCustomer().getName());
            System.out.println("Address: " + order.getCustomer().getAddress());
            System.out.println("Order:");

            double total = 0;
            for (Item item : order.getItems()) {
                System.out.println("Name: " + item.getName());
                System.out.println("Category: " + item.getCategory().getName());
                System.out.println("Main Category: " + item.getCategory().getMainCategory().getName());
                System.out.println("Price: $" + item.getPrice());
                total += item.getPrice();
            }

            System.out.println("Total: $" + total);
        } else {
            System.out.println("No order found for customer " + customerName);
        }
    }
}
