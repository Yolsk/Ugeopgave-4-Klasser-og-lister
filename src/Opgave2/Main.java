package Opgave2;

public class Main {

    public static void main() {

        Product pro1 = new Product("Earbuds", 1000, new String[]{"electronics", "new"});
        Product pro2 = new Product("PS5", 4000, new String[]{"electronics", "sale"});
        Product pro3 = new Product("Xbox", 3500, new String[]{"electronics", "sale"});
        Product pro4 = new Product("Laptop", 10000, new String[]{"electronics", "new"});

        Product[] products = {pro1, pro2, pro3, pro4};

        System.out.println("Products on sale:");

        for (Product p : products) {
            if (p.hasTag("sale")) {
                p.printInfo();
            }
        }
        Product mostExpensive = products[0];

        for(Product p : products) {
            if (p.price > mostExpensive.price) {
                mostExpensive = p;
            }

        }
        System.out.println("The most expensive product is:");
        mostExpensive.printInfo();

    }
}