package Day4;

import java.util.LinkedList;

public class Index {
    public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<>();

        products.add("Pankaj");
        products.add("IronMan");
        products.add("Chota Bheem");
        products.add("Doremon");

        products.addFirst("Aarav");

        System.out.println(products);

        products.addLast("Sunil");
        System.out.println(products);

        System.out.println(products.contains("Sunil"));

        // LinkedList<String> ClonedProducts = new LinkedList<>();

        // ClonedProducts = products;

        // System.out.println(ClonedProducts);

        for (String item : products) {
            System.out.println(item.toUpperCase());
        }

    }
}
