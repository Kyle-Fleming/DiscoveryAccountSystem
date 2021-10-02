package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNT_TRANSACTION", schema = "C##KYLE")
public class AccountTransaction implements Serializable {
    //TODO: these @Column references must be on the getters of each relevant private field
    private Number transactionId;
    private int memberId;
    private double amount;
    private LocalDate transactionDate;
    private AccountType accountType;

    public AccountTransaction() {
    }

    public AccountTransaction(int transactionId, int memberId, int amount, LocalDate transactionDate, AccountType accountType) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.accountType = accountType;
    }

    @Column(name = "TX_ID")
    public Number getTransactionId() {
        return transactionId;
    }

    @Column(name = "MEMBER_ID")
    public int getMemberId() {
        return memberId;
    }

    @Column(name = "AMOUNT")
    public double getAmount() {
        return amount;
    }


    @Column(name = "TX_DATE")
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public AccountType getAccountType() {
        return accountType;
    }

    //Set methods
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public void setTransactionId(Number transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(memberId, that.memberId) && Objects.equals(amount, that.amount) && Objects.equals(transactionDate, that.transactionDate) && Objects.equals(accountType, that.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, memberId, amount, transactionDate, accountType);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionId=" + transactionId +
                ", memberId=" + memberId +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", accountType=" + accountType +
                '}';
    }


}
