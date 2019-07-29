package by.polmak.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POJO Deal for model.
 */
public class Deal {

    private Integer dealId;
    private Date dealDate;
    private String clientFirstName;
    private String clientLastName;
    private BigDecimal budget;
    private Integer salesStageId;

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public Integer getSalesStageId() {
        return salesStageId;
    }

    public void setSalesStageId(Integer salesStageId) {
        this.salesStageId = salesStageId;
    }

    @Override
    public String toString() {
        return "Deal{"
                + "dealId=" + dealId
                + ", dealDate='" + dealDate + '\''
                + ", clientFirstName='" + clientFirstName + '\''
                + ", clientLastName='" + clientLastName + '\''
                + ", budget=" + budget
                + ", salesStageId=" + salesStageId + '}';
    }
}