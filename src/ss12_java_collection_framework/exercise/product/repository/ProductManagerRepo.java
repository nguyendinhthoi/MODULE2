package ss12_java_collection_framework.exercise.product.repository;

import ss12_java_collection_framework.exercise.product.model.PriceComparator;
import ss12_java_collection_framework.exercise.product.model.Product;

import java.util.*;

public class ProductManagerRepo implements IProductManagerRepo {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Television", 10));
        productList.add(new Product(2, "Laptop", 25));
        productList.add(new Product(3, "Fan", 0.3));
    }


    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void editProduct(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.set(i, product);
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public void displayList() {
        for (Product value : productList) {
            System.out.println(value);
        }
    }


    @Override
    public void searchProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (Objects.equals(name, productList.get(i).getName())) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void arrangeProduct() {
        Collections.sort(productList, new PriceComparator());
        for (Product value: productList) {
            System.out.println(value);

        }

    }
}

