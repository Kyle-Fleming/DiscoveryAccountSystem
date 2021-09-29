package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNT_TYPE", schema = "C##KYLE")
public class AccountType implements Serializable {
    @Id
    @SequenceGenerator(name = "C##KYLE_GENERIC_SEQ", sequenceName = "C##KYLE.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "C##KYLE_GENERIC_SEQ")
    @Column(name = "ACCOUNT_TYPE_ID")
    private Number accountTypeId;

    @Column(name = "MNEMONIC")
    private String mnemonic;

    @Column(name = "ACCOUNT_TYPE_NAME")
    private String accountTypeName;

    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;

    public AccountType(Long accountTypeId, String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.accountTypeId = accountTypeId;
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountType() {
    }

    public Number getAccountTypeId() {
        return accountTypeId;
    }


    public void setAccountTypeId(Number accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getMnemonic() {
        return mnemonic;
    }


    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }


    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }


    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(accountTypeId, that.accountTypeId) && Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTypeId, mnemonic, accountTypeName, creationDate);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "accountTypeId=" + accountTypeId +
                ", mnemonic='" + mnemonic + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
