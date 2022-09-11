package dietelExercise.chapterFour;

public class FairTaxCalculator {
    private final double fairTaxRate = 23;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private double totalPrice = 0.0;
    public double calculateTax(double price) {

        return ( 0.23 * price);
    }

    public double calculateTotalPrice(double price) {
        totalPrice += price;
        return totalPrice;
    }
}
