package Models;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;
    public Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public float getTotal() {
        float total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printBill() {
        System.out.println("Models.Customer Name: " + customer.getName());
        for (Item item : items) {
            item.getItemDetail();
        }
        System.out.println("Total: " + getTotal());
    }

    public Customer getCustomer() {
        System.out.println(customer.getName());
        ;
    }

    private String itemName;
    private float price;

    public Item(String mainCategoryName, String categoryName, String itemName, float price) {
        super(mainCategoryName, categoryName);
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void getItemDetail() {
        System.out.println("Main Models.Category: " + getMainCategoryName());
        System.out.println("Models.Category: " + getCategoryName());
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public Item[] getItems() {
        return item;
    }

    public void setItems(Item[] items) {
        this.item = items;
    }
}

