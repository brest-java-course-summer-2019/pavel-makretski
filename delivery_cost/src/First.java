import java.math.BigDecimal;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        Console console = new Console();
        System.out.println("Для расчета стоимости посылки правильно заполните данные. \nДля отмены и выхода из программы нажмите 'Q'\n");

        System.out.print("Укажите вес в килограммах: ");
        BigDecimal weight = new BigDecimal(console.setVariable());
        System.out.print("Укажите расстояние в километрах: ");
        BigDecimal distance = new BigDecimal(console.setVariable());
        System.out.println("Стоимость за кг будет взята из справочника");
        BigDecimal pricePerKg = new BigDecimal("30");
        System.out.println("Стоимость за км будет взята из справочника");
        BigDecimal pricePerKm = new BigDecimal("50");

        BigDecimal price = weight.multiply(pricePerKg).add(distance.multiply(pricePerKm));
        System.out.println("Total price: " + price);

    }

}