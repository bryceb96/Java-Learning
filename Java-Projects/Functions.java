import java.util.Scanner;

public class Functions {
    public static double calculateTotalMealPrice(double listedMealPrice, double taxRate, double tipRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        //System.out.println("Total meal price is " + result);
        return result;
    }
    public static void main(String[] args) {


        double groupTotalMealPrice = calculateTotalMealPrice(20, .5, .20);
    System.out.println(groupTotalMealPrice);

    }
}
