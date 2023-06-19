package ss12_java_collection_framework.exercise.product.service;

import ss12_java_collection_framework.exercise.product.model.Product;
import ss12_java_collection_framework.exercise.product.repository.ProductManagerRepo;

import java.util.Scanner;

public class ProductManagerService implements IProductManagerService {
    ProductManagerRepo productManagerRepo = new ProductManagerRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Enter id you want to add : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name of product :");
        String name = scanner.nextLine();
        System.out.println("Enter price of product :");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, price);
        productManagerRepo.addProduct(product);
    }

    @Override
    public void editProduct() {
        System.out.println("Enter id you want to edit : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Change name of product :");
        String name = scanner.nextLine();
        System.out.println("Change price of product :");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, price);
        productManagerRepo.editProduct(id,product);

    }

    @Override
    public void deleteProduct() {
        System.out.println("Enter the id of product you want to delete : ");
        int id = Integer.parseInt(scanner.nextLine());
        productManagerRepo.deleteProduct(id);
    }

    @Override
    public void displayList() {
        productManagerRepo.displayList();
    }

    @Override
    public void searchProduct() {
        System.out.println("Enter name of product you want to search : ");
            String name = scanner.nextLine();

            productManagerRepo.searchProduct(name);
    }

    @Override
    public void arrangeProduct() {
        productManagerRepo.arrangeProduct();

    }
}
