package by.polmak.model;

import java.math.BigDecimal;

/**
 * POJO SalesFunnel for back-end model, contains all SaleStages.
 *
 * @author Polmak Retski
 */
public class SalesStage {

    private Integer salesStageId;
    private String salesStageName;
    private Integer salesStageDealsNumber;
    private BigDecimal salesStageBudget;

    /**
     * Returns <code>Integer</code> representation of current Stage Identifier.
     *
     * @return Sales Stage identifier.
     */
    public Integer getSalesStageId() {
        return salesStageId;
    }

    /**
     * Sets the Sales Stage's identifier.
     *
     * @param salesStageId Sales Stage identifier.
     */
    public void setSalesStageId(final Integer salesStageId) {
        this.salesStageId = salesStageId;
    }

    /**
     * Returns <code>String</code> representation of Stage Name.
     *
     * @return Sales Stage Name.
     */
    public String getSalesStageName() {
        return salesStageName;
    }

    /**
     * Sets the SalesStage's name.
     *
     * @param salesStageName Sales Stage Name.
     */
    public void setSalesStageName(final String salesStageName) {
        this.salesStageName = salesStageName;
    }

    /**
     * Returns <code>Integer</code> representation of Deals number on the current Stage.
     *
     * @return Deals Number on Sale Stage.
     */
    public Integer getSalesStageDealsNumber() {
        return salesStageDealsNumber;
    }

    /**
     * Sets the SalesStage's identifier.
     *
     * @param salesStageDealsNumber Sales Stage Deals Number.
     */
    public void setSalesStageDealsNumber(final Integer salesStageDealsNumber) {
        this.salesStageDealsNumber = salesStageDealsNumber;
    }

    /**
     * Returns <code>BigDecimal</code> representation of budget for the current SalesStage.
     *
     * @return current Sales Stage Budget.
     */
    public BigDecimal getSalesStageBudget() {
        return salesStageBudget;
    }

    /**
     * Sets for the current SalesStage total budget.
     *
     * @param salesStageBudget Sales Stage Budget.
     */
    public void setSalesStageBudget(final BigDecimal salesStageBudget) {
        this.salesStageBudget = salesStageBudget;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "SalesStage\n{"
                + "salesStageId = " + salesStageId + " - "
                + "salesStageName = '" + salesStageName + "' \\ "
                + "salesStageDealsNumber = " + salesStageDealsNumber + " \\ "
                + "salesStageBudget = " + salesStageBudget + "}";
    }
}