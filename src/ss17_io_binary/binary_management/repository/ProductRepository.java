package ss17_io_binary.binary_management.repository;


import ss17_io_binary.binary_management.model.Product;
import ss17_io_binary.binary_management.util.WriterAndReader;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final static String PATH_FILE = "src/ss17_io_binary/binary_management/data/data.dat";

    @Override
    public List<Product> displayList() {
        List<Product> productList = new ArrayList<>();
        productList = WriterAndReader.readFile(PATH_FILE);
        return productList;
    }

    @Override
    public void addList(Product product) {
        List<Product> productList = new ArrayList<>();
        productList = WriterAndReader.readFile(PATH_FILE);
        productList.add(product);
        WriterAndReader.writerFile(PATH_FILE, productList);
    }

    @Override
    public void searchProduct(int id) {
        List<Product> productList = displayList();
        System.out.println(productList.get(searchIndex(id)));
    }

    @Override
    public int searchIndex(int id) {
        List<Product> productList = displayList();
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
}
