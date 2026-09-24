package Opgave2;

public class Product {
    String name;
    double price;
    String[] tags;

    Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }
    void printInfo() {
        System.out.println("Name: " + name + "Price: " + price);
        System.out.println("tags: ");

        for (String tag : tags) {
            System.out.println(tag + " ");
        }
        System.out.println();
    }
    boolean hasTag(String tag) {
        for (String t : tags) {
            if (t.equalsIgnoreCase(tag)) {
                return true;
            }
        }
        return false;

    }


}
