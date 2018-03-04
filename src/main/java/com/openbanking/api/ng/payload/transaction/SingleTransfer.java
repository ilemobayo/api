package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.Currency;
import com.openbanking.api.ng.definition.PeriodType;

import java.math.BigDecimal;
import java.util.Date;

public class SingleTransfer {
    private String referenceId;
    private String sourceAccount;
    private String sourceAccountName;
    private String sourceAmount;
    private Currency sourceCurrency;
    private String sourceNarration;
    private BigDecimal amount;
    private Currency currency;
    private String destinationNarration;
    private String transactionFee;
    private String channel;
    private int latitude;
    private int longitude;
    private Date transactionDate;
    private PeriodType interval;
    private Date startDate;
    private Date endDate;
    private int numberOfTime;

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getSourceAccountName() {
        return sourceAccountName;
    }

    public void setSourceAccountName(String sourceAccountName) {
        this.sourceAccountName = sourceAccountName;
    }

    public String getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        this.sourceAmount = sourceAmount;
    }


    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getDestinationNarration() {
        return destinationNarration;
    }

    public void setDestinationNarration(String destinationNarration) {
        this.destinationNarration = destinationNarration;
    }

    public String getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(String transactionFee) {
        this.transactionFee = transactionFee;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public PeriodType getInterval() {
        return interval;
    }

    public void setInterval(PeriodType interval) {
        this.interval = interval;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getNumberOfTime() {
        return numberOfTime;
    }

    public void setNumberOfTime(int numberOfTime) {
        this.numberOfTime = numberOfTime;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Currency getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(Currency sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getSourceNarration() {
        return sourceNarration;
    }

    public void setSourceNarration(String sourceNarration) {
        this.sourceNarration = sourceNarration;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
