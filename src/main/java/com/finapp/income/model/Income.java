package com.finapp.income.model;


import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "income")
public class Income implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "income_id")
    private Long incomeId;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "source", nullable = false)
    private String source;

    @Column(name = "income_date", nullable = false)
    private LocalDate incomeDate;

    @Column(name = "createdAt", nullable = false)
    private LocalDate createdAt;

    public Income() {
    }

    public Income(Double amount, String source, LocalDate incomeDate, LocalDate createdAt) {
        this.amount = amount;
        this.source = source;
        this.incomeDate = incomeDate;
        this.createdAt = createdAt;
    }

    public Long getIncomeId() {
        return this.incomeId;
    }

    public void setIncomeId(Long incomeId) {
        this.incomeId = incomeId;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDate getIncomeDate() {
        return this.incomeDate;
    }

    public void setIncomeDate(LocalDate incomeDate) {
        this.incomeDate = incomeDate;
    }

    public LocalDate getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "{" +
            " incomeId='" + getIncomeId() + "'" +
            ", amount='" + getAmount() + "'" +
            ", source='" + getSource() + "'" +
            ", incomeDate='" + getIncomeDate() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            "}";
    }

}
