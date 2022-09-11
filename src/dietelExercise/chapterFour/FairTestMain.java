package dietelExercise.chapterFour;

import java.util.Scanner;

public class FairTestMain {
    public static void main(String[] args) throws FairTaxException {
        Scanner scanner = new Scanner(System.in);
        FairTaxCalculator fairTaxCalculator = new FairTaxCalculator();
        System.out.println("number of products?");
       int numberOfProducts = scanner.nextInt();

       if (numberOfProducts < 1) throw new FairTaxException("product number cannot be "+ numberOfProducts);

       for (int index = 1; index <= numberOfProducts ; index++){
           System.out.printf("enter product  %d 's name", index);
           String productName = scanner.next();
           System.out.printf(" enter price of %s!\n", productName);
           double productPrice = scanner.nextDouble();
           Product product = new Product(productName, productPrice);
           fairTaxCalculator.calculateTotalPrice(product.getPrice());
       }
       double grandTotal = fairTaxCalculator.getTotalPrice();
       double tax = fairTaxCalculator.calculateTax(grandTotal);
        System.out.printf("pay %f now !!!", tax);
    }
}
