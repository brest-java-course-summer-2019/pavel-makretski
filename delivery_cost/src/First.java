import java.math.BigDecimal;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        First first = new First();
        System.out.print("Введите вес в килограммах: ");
        BigDecimal weight = new BigDecimal(first.setVariable());
        System.out.print("Введите расстояние в километрах: ");
        BigDecimal distance = new BigDecimal(first.setVariable());
        BigDecimal pricePerKg = new BigDecimal("30");
        BigDecimal pricePerKm = new BigDecimal("50");

        BigDecimal price = weight.multiply(pricePerKg).add(distance.multiply(pricePerKm));
        System.out.println("Total price: " + price);

    }

    public String setVariable(){
        Scanner scan = new Scanner(System.in);
        String var = scan.nextLine();
        return var;
    }
}