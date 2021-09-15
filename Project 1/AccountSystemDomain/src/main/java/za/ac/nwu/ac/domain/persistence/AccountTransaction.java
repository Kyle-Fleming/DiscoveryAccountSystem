package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "DEMO_ACCOUNT_TYPE", schema = "VITRSA_SANDBOX")
public class AccountTransaction implements Serializable {
    @Column(name = "TX_ID")
    private Long transactionId;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "TX_DATE")
    private LocalDate transactionDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    private AccountType accountType;


    public AccountTransaction() {
    }

    public AccountTransaction(Long transactionId, Long memberId, Long amount, LocalDate transactionDate, AccountType accountType) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.accountType = accountType;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
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
