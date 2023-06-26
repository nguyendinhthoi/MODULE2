package ss17_io_binary.binary_management.service;

import ss17_io_binary.binary_management.common.IdNotFound;
import ss17_io_binary.binary_management.model.Product;
import ss17_io_binary.binary_management.repository.ProductRepository;


import java.util.List;

import static ss17_io_binary.binary_management.view.Run.scanner;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public void displayList() {
        List<Product> productList = productRepository.displayList();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addList() {
        System.out.print("Enter Id of Product : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Name of Product : ");
        String name = scanner.nextLine();
        System.out.print("Enter Price of Product : ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Brand of Product : ");
        String brand = scanner.nextLine();
        System.out.print("Enter Description of Product : ");
        String des = scanner.nextLine();
        Product product = new Product(id, name, price, brand, des);
        productRepository.addList(product);
    }

    @Override
    public void searchProduct() {
        try {
            System.out.println("Enter ID you want to search : ");
            int id = Integer.parseInt(scanner.nextLine());
            if (productRepository.searchIndex(id) == -1) {
                throw new IdNotFound();
            } else {
                productRepository.searchProduct(id);
            }
        } catch (IdNotFound e) {
            System.out.println("ID not Found!!");
        }

    }

}
