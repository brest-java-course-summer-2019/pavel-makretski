package by.polmak.model;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

/**
 * Unit tests for model Sales Stage.
 */
public class SalesStageTest {

    SalesStage salesStage = new SalesStage();

    @Test
    public void getSalesStageId() {
        salesStage.setSalesStageId(42);
        Assert.assertTrue(salesStage.getSalesStageId().equals(42));
    }

    @Test
    public void getSalesStageName() {
        salesStage.setSalesStageName("SUCCESS");
        Assert.assertTrue(salesStage.getSalesStageName().endsWith("SUCCESS"));
    }

    @Test
    public void getTotalBudget() {
        salesStage.setTotalBudget(new BigDecimal(4000.42));
        Assert.assertTrue(salesStage.getTotalBudget().equals(new BigDecimal(4000.42)));
    }

    @Test
    public void checkToString() {
        String expected = salesStage.toString();
        String actual = "SalesStage{\n" +
                "salesStageId=null, salesStageName='null \\, totalBudget=null}";
        Assert.assertEquals(expected, actual);
    }
}