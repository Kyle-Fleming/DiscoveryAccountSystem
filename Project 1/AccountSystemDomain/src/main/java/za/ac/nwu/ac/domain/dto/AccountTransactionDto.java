package za.ac.nwu.ac.domain.dto;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Component
public class AccountTransactionDto implements Serializable {
    private LocalDate transactionDate;
    private int memberID;
    private Number transactionID;
    private double amount;
    private AccountTransaction accountTransaction;

    public AccountTransactionDto(AccountTransaction accountTransaction) {
        this.accountTransaction = accountTransaction;
        this.setAmount(accountTransaction.getAmount());
        this.setTransactionDate(accountTransaction.getTransactionDate());
        this.setTransactionID(accountTransaction.getTransactionId());
        this.setMemberID(accountTransaction.getMemberId());
    }

    public AccountTransactionDto(LocalDate transactionDate, int memberID, int transactionID, double amount) {
        this.transactionDate = transactionDate;
        this.memberID = memberID;
        this.transactionID = transactionID;
        this.amount = amount;
    }

    public AccountTransaction getAccountTransaction() {
        return accountTransaction;
    }

    public void setAccountTransaction(AccountTransaction accountTransaction) {
        this.accountTransaction = accountTransaction;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public Number getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Number transactionID) {
        this.transactionID = transactionID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransactionDto that = (AccountTransactionDto) o;
        return memberID == that.memberID && transactionID == that.transactionID && Double.compare(that.amount, amount) == 0 && Objects.equals(transactionDate, that.transactionDate) && Objects.equals(accountTransaction, that.accountTransaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionDate, memberID, transactionID, amount, accountTransaction);
    }

    @Override
    public String toString() {
        return "AccountTransactionDto{" +
                "transactionDate=" + transactionDate +
                ", memberID=" + memberID +
                ", transactionID=" + transactionID +
                ", amount=" + amount +
                ", accountTransaction=" + accountTransaction +
                '}';
    }
}
