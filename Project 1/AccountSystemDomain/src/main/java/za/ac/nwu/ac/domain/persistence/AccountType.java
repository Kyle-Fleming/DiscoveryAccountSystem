package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNT_CURRENCY_TYPE", schema = "KYLE")
public class AccountType implements Serializable {

    private Number accountTypeId;
    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    //private Set<AccountTransaction> accountTransactions;

    public AccountType() {
    }

    public AccountType(Number accountTypeId, String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.accountTypeId = accountTypeId;
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }
    public AccountType(String mnemonic, String accountTypeName, LocalDate creationDate){
        this.mnemonic=mnemonic;
        this.accountTypeName=accountTypeName;
        this.creationDate=creationDate;
    }



    @Id
    @SequenceGenerator(name = "ACCOUNT_CURRENCY_TYPE_SEQ", sequenceName = "KYLE.ACCOUNT_CURRENCY_TYPE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNT_CURRENCY_TYPE_SEQ")
    @Column(name = "ACCOUNT_CURRENCY_TYPE_ID")
    public Number getAccountTypeId() {
        return accountTypeId;
    }

    @Column(name = "MNEMONIC")
    public String getMnemonic() {
        return mnemonic;
    }

    @Column(name = "ACCOUNT_TYPE_NAME")
    public String getAccountTypeName() {
        return accountTypeName;
    }

    @Column(name = "CREATION_DATE")
    public LocalDate getCreationDate() {
        return creationDate;
    }

  /*  @OneToMany(targetEntity = AccountTransaction.class, fetch = FetchType.LAZY, mappedBy = "accountType", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<AccountTransaction> getAccountTransactions(){
        return accountTransactions;
    }
*/
    //Set methods
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
    public void setAccountTypeId(Number accountTypeId) {
        this.accountTypeId = accountTypeId;
    }
    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }
    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

   /* public void setAccountTransactions(Set<AccountTransaction> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }
*/
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
}
