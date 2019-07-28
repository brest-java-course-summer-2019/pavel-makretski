package by.polmak.model;

import java.math.BigDecimal;

/**
 * POJO SalesStage for model, contains SaleStages.
 */
public class SalesStage {

    /**
     * SalesStage Id.
     */
    private Integer salesStageId;
    /**
     * SalesStage Name.
     */
    private String salesStageName;
    /**
     * Total budget of the SalesStage.
     */
    private BigDecimal totalBudget;

    /**
     * Returns <code>Integer</code> representation of this salesStageId.
     *
     * @return salesStageId SalesStage Id.
     */
    public Integer getSalesStageId() {
        return salesStageId;
    }

    /**
     * Sets the SalesStage's identifier.
     *
     * @param salesStageId SalesStage Id.
     */
    public void setSalesStageId(final Integer salesStageId) {
        this.salesStageId = salesStageId;
    }

    /**
     * Returns <code>String</code> representation of this salesStageName.
     *
     * @return salesStageName SalesStage Name.
     */
    public String getSalesStageName() {
        return salesStageName;
    }

    /**
     * Sets the SalesStage's name.
     *
     * @param salesStageName SalesStage Name.
     */
    public void setSalesStageName(final String salesStageName) {
        this.salesStageName = salesStageName;
    }

    /**
     * Returns <code>BigDecimal</code> representation of total budget for the current SalesStage.
     *
     * @return totalBudget.
     */
    public BigDecimal getTotalBudget() {
        return totalBudget;
    }

    /**
     * Sets for the current SalesStage total budget.
     *
     * @param totalBudget totalBudget.
     */
    public void setTotalBudget(final BigDecimal totalBudget) {
        this.totalBudget = totalBudget;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "SalesStage{"
                + "\nsalesStageId=" + salesStageId
                + ", salesStageName='" + salesStageName + " \\"
                + ", totalBudget=" + totalBudget + "}";
    }
}