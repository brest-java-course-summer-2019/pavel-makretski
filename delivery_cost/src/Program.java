import java.io.IOException;
import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) throws IOException {

        Console console = new Console();
        Config config = new Config();
        System.out.println("Для расчета стоимости посылки правильно заполните данные. \nДля отмены и выхода из программы нажмите 'Q'\n");

        System.out.print("Укажите вес в килограммах: ");
        BigDecimal weight = new BigDecimal(console.setVariable());
        System.out.print("Укажите расстояние в километрах: ");
        BigDecimal distance = new BigDecimal(console.setVariable());

        System.out.println("Стоимость за кг принята по умолчанию");
        BigDecimal pricePerKg = new BigDecimal("30");
        System.out.println("Стоимость за км будет взята из справочника");
        BigDecimal pricePerKm = new BigDecimal(config.price(distance.intValue()));

        BigDecimal price = weight.multiply(pricePerKg).add(distance.multiply(pricePerKm));
        System.out.println("Total price: " + price);

    }
}