package by.polmak.model;

import org.junit.Assert;
import org.junit.Test;

public class SalesStageTest {

    SalesStage salesStage = new SalesStage();

    @Test
    public void getSalesStageId(){
        salesStage.setSalesStageId(42);
        Assert.assertTrue(salesStage.getSalesStageId().equals(42));
    }

    @Test
    public void getSalesStageName(){
        salesStage.setSalesStageName("SUCCESS");
        Assert.assertTrue(salesStage.getSalesStageName().endsWith("SUCCESS"));
    }

    @Test
    public void getTotalBudget(){
        salesStage.setTotalBudget(42);
        Assert.assertTrue(salesStage.getTotalBudget().equals(42));
    }
}