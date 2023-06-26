package ss17_io_binary.binary_management.repository;

import ss17_io_binary.binary_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> displayList();

    void addList(Product product);

    void searchProduct(int id);

    int searchIndex(int id);
}
