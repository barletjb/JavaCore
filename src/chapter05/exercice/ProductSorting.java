package chapter05.exercice;

import java.util.Arrays;

public class ProductSorting {

    public String name;
    public String category;

    public double price;
    public char currency;

    public ProductSorting(String name, String category, double price, char currency) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    public void displayProduct() {
        System.out.println("Product Name : " + this.name + " | Category : " + this.category + " | Price : " + this.price + this.currency);
    }

    private static double usdPrice(ProductSorting p) {
        return switch (p.currency) {
            case '€' -> p.price / 0.95;
            case '£' -> p.price / 0.79;
            case '¥' -> p.price / 7.27;
            default -> p.price;
        };
    }

    private static ProductSorting[] sortArray(ProductSorting[] p){
        boolean swapped;
        int index = p.length;

        do {
            swapped = false;
            for (int i = 0; i < index - 1; i++){
                double leftUsd = usdPrice(p[i]);
                double rightUsd = usdPrice(p[i + 1]);

                if (leftUsd < rightUsd){
                    ProductSorting temp = p[i];
                    p[i] = p[i + 1];
                    p[i + 1] = temp;
                    swapped = true;
                }
                p[i].currency = '$';
            }
            index--;
        }while (swapped);

        return p;
    }


    public static void main(String[] args) {

        ProductSorting[] productArray = generateFakeProductList();

        ProductSorting[] sortArray = sortArray(productArray);

        for (int i = 0; i < productArray.length; i++){
            sortArray[i].displayProduct();
        }


    }

    public static ProductSorting[] generateFakeProductList() {

        ProductSorting[] productArray = new ProductSorting[10];

        productArray[0] = new ProductSorting("Samsung G9", "Gaming Screen", 1499.99, '$');
        productArray[1] = new ProductSorting("Porsche 911", "Car", 120000, '€');
        productArray[2] = new ProductSorting("IKEA Sofa", "Seating", 599.99, '£');
        productArray[3] = new ProductSorting("MacBook Pro M3", "Laptop", 2499.99, '$');
        productArray[4] = new ProductSorting("Rolex Submariner", "Watch", 9500, '€');
        productArray[5] = new ProductSorting("Bose QuietComfort 45", "Headphones", 329.99, '$');
        productArray[6] = new ProductSorting("Dyson V15 Detect", "Vacuum Cleaner", 7390.10, '¥');
        productArray[7] = new ProductSorting("Harley-Davidson Fat Boy", "Motorcycle", 20300, '€');
        productArray[8] = new ProductSorting("Canon EOS R5", "Camera", 3899, '$');
        productArray[9] = new ProductSorting("Lego Millennium Falcon", "Toy", 849.99, '$');

        return productArray;

    }

}
