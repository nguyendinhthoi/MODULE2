package ss17_io_binary.binary_management.view;

import ss17_io_binary.binary_management.controller.ProductController;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}
