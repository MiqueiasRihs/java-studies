package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.printf("%s, $%.2f, %s units, Total: $%.2f%n%n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        int new_qnt = sc.nextInt();
        product.addProduct(new_qnt);

        System.out.printf("Updated data: %s, $%.2f, %s units, Total: $%.2f%n%n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.print("Enter the number of products to be removed from stock: ");
        int qnt_to_remove = sc.nextInt();
        product.removeProduct(qnt_to_remove);

        System.out.printf("Updated data: %s, $%.2f, %s units, Total: $%.2f%n%n", product.name, product.price, product.quantity, product.totalValueInStock());

        sc.close();
    }
}
