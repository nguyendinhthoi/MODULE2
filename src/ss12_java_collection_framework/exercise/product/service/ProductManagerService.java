package ss12_java_collection_framework.exercise.product.service;

import ss12_java_collection_framework.exercise.product.model.Product;
import ss12_java_collection_framework.exercise.product.repository.ProductManagerRepo;

import java.util.Objects;
import java.util.Scanner;

public class ProductManagerService implements IProductManagerService {
    ProductManagerRepo productManagerRepo = new ProductManagerRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.print("Enter id you want to add : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name of product :");
        String name = scanner.nextLine();
        System.out.print("Enter price of product :");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, price);
        productManagerRepo.addProduct(product);
    }

    @Override
    public void editProduct() {
        System.out.print("Enter id you want to edit : ");
        int id = Integer.parseInt(scanner.nextLine());
        if (Objects.equals(productManagerRepo.searchIndex(id), -1)) {
            System.err.println("Id not found");
        } else {
            System.out.print("Change name of product :");
            String name = scanner.nextLine();
            System.out.print("Change price of product :");
            double price = Double.parseDouble(scanner.nextLine());

            Product product = new Product(id, name, price);
            productManagerRepo.editProduct(id, product);
        }
    }

    @Override
    public void deleteProduct() {
        System.out.print("Enter the id of product you want to delete : ");
        int id = Integer.parseInt(scanner.nextLine());
        if (Objects.equals(productManagerRepo.searchIndex(id), -1)) {
            System.err.println("Id not found");
        } else {
            productManagerRepo.showProductById(id);
            System.out.print("You want to delete this product?(yes or no)");
            String confirm = scanner.nextLine();
            if (Objects.equals(confirm, "yes")) {
                productManagerRepo.deleteProduct(id);
            } else if (Objects.equals(confirm, "no")) {
                System.err.println("Choose another function again!");
            }
        }
    }

    @Override
    public void displayList() {
        productManagerRepo.displayList();
    }

    @Override
    public void searchProduct() {
        System.out.print("Enter name of product you want to search : ");
        String name = scanner.nextLine();

        productManagerRepo.searchProduct(name);
    }

    @Override
    public void showProductById() {
        System.out.print("Enter Id to check index of product : ");
        int id = Integer.parseInt(scanner.nextLine());
        productManagerRepo.showProductById(id);
    }

    @Override
    public void searchIndex() {
        System.out.print("Enter Id to check index of product : ");
        int id = Integer.parseInt(scanner.nextLine());
        productManagerRepo.searchIndex(id);
    }

    @Override
    public void arrangeProduct() {
        productManagerRepo.arrangeProduct();
    }
}
