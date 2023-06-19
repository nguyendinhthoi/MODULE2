package ss12_java_collection_framework.exercise.product.repository;

import ss12_java_collection_framework.exercise.product.model.Product;

public interface IProductManagerRepo {


    void addProduct(Product product);



    void editProduct(int id, Product product);

    void deleteProduct(int id);

    void displayList();


    void searchProduct(String name);

    void arrangeProduct();
}
