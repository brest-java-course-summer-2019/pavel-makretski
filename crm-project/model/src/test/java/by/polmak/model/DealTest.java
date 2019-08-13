package by.polmak.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Unit tests for model Deal.
 */
public class DealTest {

    private Deal deal = new Deal();

    @Test
    public void getDealId() {
        deal.setDealId(42);
        Assert.assertEquals(42, (int) deal.getDealId());
    }

    @Test
    public void getDealName() {
        deal.setDealDate(new Date(1212121212L));
        Assert.assertEquals(deal.getDealDate(), new Date(1212121212L));
    }

    @Test
    public void getClientFirstName() {
        deal.setClientFirstName("POLMAK");
        Assert.assertEquals("POLMAK", deal.getClientFirstName());
    }

    @Test
    public void getClientLastName() {
        deal.setClientLastName("RETSKI");
        Assert.assertEquals("RETSKI", deal.getClientLastName());
    }

    @Test
    public void getBudget(){
        deal.setDealBudget(new BigDecimal(4000.42));
        Assert.assertEquals(deal.getDealBudget(), new BigDecimal(4000.42));
    }

    @Test
    public void getSalesStageId(){
        deal.setSalesStageId(42);
        Assert.assertEquals(42, (int) deal.getSalesStageId());
    }

    @Test
    public void checkToString() {
        String expected = deal.toString();
        String actual = "Deal"
                + "\n{salesStageId = null - dealId = null - dealDate = null "
                + "\\ clientName = 'null null \\ dealBudget=null}";
        Assert.assertEquals(expected, actual);
    }
}