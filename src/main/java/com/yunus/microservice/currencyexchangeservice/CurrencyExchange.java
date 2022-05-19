package com.yunus.microservice.currencyexchangeservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CurrencyExchange {

    @Id
    private Long id;
    @Column(name = "currencyFrom")
    private String from;
    @Column(name = "currencyTo")
    private String to;
    private BigDecimal currencyRate;
    private String environment;

    public CurrencyExchange(){

    }

    public CurrencyExchange(Long id, String from, String to, BigDecimal currencyRate) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.currencyRate = currencyRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(BigDecimal currencyRate) {
        this.currencyRate = currencyRate;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
