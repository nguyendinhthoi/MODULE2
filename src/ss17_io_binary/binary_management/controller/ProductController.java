package ss17_io_binary.binary_management.controller;

import ss17_io_binary.binary_management.service.ProductService;

import static ss17_io_binary.binary_management.view.Run.scanner;

public class ProductController {
    ProductService productService = new ProductService();

    public void showMenu() {
        do {
            System.out.print("-----PRODUCT MANAGEMENT-----\n" +
                    "1. Add product\n" +
                    "2. Display product\n" +
                    "3. Search product\n" +
                    "4. Exit\n" +
                    "Enter choice here : ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("-----ADD MODE-----");
                    productService.addList();
                    break;
                case 2:
                    System.out.println("-----DISPLAY MODE-----");
                    productService.displayList();
                    break;
                case 3:
                    System.out.println("-----SEARCH MODE-----");
                    productService.searchProduct();
                    break;
                case 4:
                    System.out.println("The program was closed");
                    System.exit(0);
            }
        } while (true);
    }
}
