import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

public class Config {

    int price(int distance) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("delivery_cost" + File.separator + "resources" + File.separator + "config.properties"));
        int priceKM;

        if (distance <= 500) {
            priceKM = Integer.parseInt(properties.getProperty("PRICE_PER_KM_1_ZONE"));
        } else if (distance > 1000) {
            priceKM = Integer.parseInt(properties.getProperty("PRICE_PER_KM_3_ZONE"));
        } else priceKM = Integer.parseInt(properties.getProperty("PRICE_PER_KM_2_ZONE"));

        return priceKM;
    }
}
