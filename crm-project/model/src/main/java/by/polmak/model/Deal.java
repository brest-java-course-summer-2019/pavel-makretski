package by.polmak.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POJO Deal for back-end model, contains one Deal.
 *
 * @author Polmak Retski
 */
public class Deal {

    private Integer dealId;
    private Date dealDate;
    private String clientFirstName;
    private String clientLastName;
    private BigDecimal dealBudget;
    private Integer salesStageId;

    /**
     * Returns <code>Integer</code> representation of current Deal Identifier.
     *
     * @return current Deal identifier.
     */
    public Integer getDealId() {
        return dealId;
    }

    /**
     * Sets the current Deal identifier.
     *
     * @param dealId Deal Identifier.
     */
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    /**
     * Returns <code>Date</code> representation of date, when Deal was concluded.
     *
     * @return Deal Date.
     */
    public Date getDealDate() {
        return dealDate;
    }

    /**
     * Sets the Date made the Deal.
     *
     * @param dealDate Deal Date.
     */
    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    /**
     * Returns <code>String</code> representation of client's First Name.
     *
     * @return Client First Name.
     */
    public String getClientFirstName() {
        return clientFirstName;
    }

    /**
     * Sets the client's First Name.
     *
     * @param clientFirstName Sales Stage Name.
     */
    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    /**
     * Returns <code>String</code> representation of client's Last Name.
     *
     * @return Client Last Name.
     */
    public String getClientLastName() {
        return clientLastName;
    }

    /**
     * Sets the client's Last Name.
     *
     * @param clientLastName Sales Stage Name.
     */
    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    /**
     * Returns <code>BigDecimal</code> representation of this Deal Budget.
     *
     * @return Deal Budget.
     */
    public BigDecimal getDealBudget() {
        return dealBudget;
    }

    /**
     * Sets Budget for the current Deal.
     *
     * @param dealBudget Deal Budget.
     */
    public void setDealBudget(BigDecimal dealBudget) {
        this.dealBudget = dealBudget;
    }

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
    public void setSalesStageId(Integer salesStageId) {
        this.salesStageId = salesStageId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Deal\n{"
                + "salesStageId = " + salesStageId + " - "
                + "dealId = " + dealId + " - "
                + "dealDate = " + dealDate + " \\ "
                + "clientName = '" + clientFirstName + " " + clientLastName + " \\ "
                + "dealBudget=" + dealBudget + '}';
    }
}