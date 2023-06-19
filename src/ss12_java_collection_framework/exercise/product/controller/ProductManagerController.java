package ss12_java_collection_framework.exercise.product.controller;

import ss12_java_collection_framework.exercise.product.service.ProductManagerService;

import java.util.Scanner;

public class ProductManagerController {
    ProductManagerService productManagerService = new ProductManagerService();
    public static Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        do {
            System.out.println("-----MANAGEMENT PROGRAM-----");
            System.out.println("1. Add product" +
                    "\n2. Edit product" +
                    "\n3. Delete product" +
                    "\n4. Display product list" +
                    "\n5. Search product" +
                    "\n6. Arrange product list" +
                    "\n7. Exit" +
                    "\nChoose function you want : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("-$-ADD MODE-$-");
                    productManagerService.addProduct();
                    break;
                case 2:
                    System.out.println("-$-EDIT MODE-$-");
                    productManagerService.editProduct();
                    break;
                case 3:
                    System.out.println("-$-DELETE MODE-$-");
                    productManagerService.deleteProduct();
                    break;
                case 4:
                    System.out.println("-$-DISPLAY MODE-$-");
                    productManagerService.displayList();
                    break;
                case 5:
                    System.out.println("-$-SEARCH MODE-$-");
                    productManagerService.searchProduct();
                    break;
                case 6:
                    System.out.println("-$-ARRANGE MODE-$-");
                    productManagerService.arrangeProduct();
                    break;

                case 7:
                    System.err.println("-$-THE PROGRAM IS CLOSED-$-");
                    System.exit(0);
            }
        } while (true);
    }
}
