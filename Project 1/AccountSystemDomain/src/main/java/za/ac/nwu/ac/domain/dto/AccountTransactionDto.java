package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@ApiModel(value = "AccountTransaction",
        description = "A DTO that represents the AccountTransaction")
public class AccountTransactionDto implements Serializable {

    private int memberID;
    private double amount;
    private LocalDate transactionDate;
    private AccountTransaction accountTransaction;

    public AccountTransactionDto(AccountTransaction accountTransaction) {
        this.accountTransaction = accountTransaction;
        this.setAmount(accountTransaction.getAmount());
        this.setTransactionDate(accountTransaction.getTransactionDate());
        this.setMemberID(accountTransaction.getMemberId());
    }

    public AccountTransactionDto(LocalDate transactionDate, int memberID, double amount) {
        this.transactionDate = transactionDate;
        this.memberID = memberID;
        this.amount = amount;
    }

    @JsonIgnore
    public AccountTransaction getAccountTransaction() {
        return accountTransaction;
    }

    @ApiModelProperty(position = 1,
            value =    "AccountTransaction transactionDate",
            name =     "transactionDate",
            notes =    "Date on which the transaction occurred",
            dataType = "java.util.LocalDate",
            example =  "2021-01-01",
            required = true)
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    @ApiModelProperty(position = 1,
            value =    "AccountTransaction memberId",
            name =     "Member ID",
            notes =    "Identifier for currency type for transaction",
            dataType = "java.lang.String",
            example =  "2",
            required = true)
    public int getMemberID() {
        return memberID;
    }


    @ApiModelProperty(position = 1,
            value =    "AccountType amount",
            name =     "Amount",
            notes =    "Value of the transaction",
            dataType = "java.lang.Double",
            example =  "150.0",
            required = true)
    public double getAmount() {
        return amount;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setAccountTransaction(AccountTransaction accountTransaction) {
        this.accountTransaction = accountTransaction;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransactionDto that = (AccountTransactionDto) o;
        return memberID == that.memberID && Double.compare(that.amount, amount) == 0 && Objects.equals(transactionDate, that.transactionDate) && Objects.equals(accountTransaction, that.accountTransaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionDate, memberID, amount, accountTransaction);
    }

    @Override
    public String toString() {
        return "AccountTransactionDto{" +
                "transactionDate=" + transactionDate +
                ", memberID=" + memberID +
                ", amount=" + amount +
                ", accountTransaction=" + accountTransaction +
                '}';
    }
}
