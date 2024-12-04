package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "CompanyData")
@NoArgsConstructor
@AllArgsConstructor

public class CompanyData {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "DATE", nullable = false)
    private Date date;
    @Column(name = "COMPANY_CODE", nullable = false)
    private String companyCode;
    @Column(name = "TRANSACTION_AMOUNT", nullable = false)
    private float transactionAmount;
    @Column(name = "MAX_AMOUNT", nullable = false)
    private float maxAmount;
    @Column(name = "MIN_AMOUNT", nullable = false)
    private float minAmount;
    @Column(name = "AVERAGE_AMOUNT", nullable = false)
    private float averageAmount;
    @Column(name = "PERCENTAGE", nullable = false)
    private float percentage;
    @Column(name = "QUANTITY", nullable = false)
    private int quantity;
    @Column(name = "BESTTURNOVER", nullable = false)
    private float BESTturnover;
    @Column(name = "TOTALTURNOVER", nullable = false)
    private float TOTALturnover;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public float getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(float maxAmount) {
        this.maxAmount = maxAmount;
    }

    public float getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(float minAmount) {
        this.minAmount = minAmount;
    }

    public float getAverageAmount() {
        return averageAmount;
    }

    public void setAverageAmount(float averageAmount) {
        this.averageAmount = averageAmount;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getBESTturnover() {
        return BESTturnover;
    }

    public void setBESTturnover(float BESTturnover) {
        this.BESTturnover = BESTturnover;
    }

    public float getTOTALturnover() {
        return TOTALturnover;
    }

    public void setTOTALturnover(float TOTALturnover) {
        this.TOTALturnover = TOTALturnover;
    }
}