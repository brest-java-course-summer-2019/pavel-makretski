package by.polmak.model;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

/**
 * Unit tests for model Sales Stage.
 * @author Polmak Retski
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
    public void getSalesStageDealsNumber() {
        salesStage.setSalesStageDealsNumber(42);
        Assert.assertTrue(salesStage.getSalesStageDealsNumber().equals(42));
    }

    @Test
    public void getSalesStageBudget() {
        salesStage.setSalesStageBudget(new BigDecimal(4000.42));
        Assert.assertTrue(salesStage.getSalesStageBudget().equals(new BigDecimal(4000.42)));
    }

    @Test
    public void checkToString() {
        String expected = salesStage.toString();
        String actual = "SalesStage" +
                "\n{salesStageId = null - salesStageName = 'null' " +
                "\\ salesStageDealsNumber = null " +
                "\\ salesStageBudget = null}";
        Assert.assertEquals(expected, actual);
    }
}