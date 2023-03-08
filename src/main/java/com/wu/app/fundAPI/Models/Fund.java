package com.wu.app.fundAPI.Models;
import javax.persistence.*;
import java.util.*;

@Entity
public class Fund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long fundId;

    public long getFundId() {
        return fundId;
    }

    public void setFundId(long fundId) {
        this.fundId = fundId;
    }

    public String getFundDescription() {
        return fundDescription;
    }

    public void setFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public double getOfferzprice() {
        return offerzprice;
    }

    public void setOfferzprice(double offerzprice) {
        this.offerzprice = offerzprice;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Column
    private String fundDescription;

    @Column
    private double bidPrice;

    @Column
    private double offerzprice;

    @Column
    private Date lastUpdated;

    public long getId(){
        return fundId;
    }
}