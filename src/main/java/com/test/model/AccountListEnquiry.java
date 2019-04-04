package com.test.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by smanicka on 3/4/19.
 */
@Document
public class AccountListEnquiry {

    @Id
    private String id;

    private Integer accountNumber;
    private String accountName;
    private String accountType;
    private Date balanceDate;
    private String currency;
    private BigDecimal openingAvailableBalance;
    private List<AccountTransactionEnquiry> accountTransactionEnquiries;

    public AccountListEnquiry() {
    }

    public AccountListEnquiry(Integer accountNumber,
                              String accountName,
                              String accountType,
                              Date balanceDate,
                              String currency,
                              BigDecimal openingAvailableBalance,
                              List<AccountTransactionEnquiry> accountTransactionEnquiries) {
        this.accountNumber =  accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balanceDate = balanceDate;
        this.currency = currency;
        this.openingAvailableBalance = openingAvailableBalance;
        this.accountTransactionEnquiries = accountTransactionEnquiries;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getOpeningAvailableBalance() {
        return openingAvailableBalance;
    }

    public void setOpeningAvailableBalance(BigDecimal openingAvailableBalance) {
        this.openingAvailableBalance = openingAvailableBalance;
    }

    public List<AccountTransactionEnquiry> getAccountTransactionEnquiries() {
        return accountTransactionEnquiries;
    }

    public void setAccountTransactionEnquiries(List<AccountTransactionEnquiry> accountTransactionEnquiries) {
        this.accountTransactionEnquiries = accountTransactionEnquiries;
    }

}
