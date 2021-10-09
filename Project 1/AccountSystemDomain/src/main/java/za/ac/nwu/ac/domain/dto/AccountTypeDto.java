package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@Component
public class AccountTypeDto implements  Serializable{

    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;
    private AccountType accountType;
    public AccountTypeDto() {
    }

    public AccountTypeDto(String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountTypeDto(AccountType accountType) {
        this.accountType = accountType;
        this.setAccountTypeName(accountType.getAccountTypeName());
        this.setCreationDate(accountType.getCreationDate());
        this.setMnemonic(accountType.getMnemonic());
    }

    @ApiModelProperty(position = 1,
    value = "AccountType Mnemonic",
    name = "Mnemonic",
    notes = "Uniquely identifies the account type",
    dataType = "java.lang.String",
    example = "MILES",
    required = true)
    public String getMnemonic() {return mnemonic;}

    @ApiModelProperty(position = 2,
            value = "AccountType Name",
            name = "Name",
            notes = "Name of the account type",
            dataType = "java.lang.String",
            example = "Miles",
            required = true)
    public String getAccountTypeName() {return accountTypeName;}

    @ApiModelProperty(position = 3,
            value = "AccountType Creation Date",
            name = "CreationDate",
            notes = "Identifies the date when the account type was created",
            dataType = "java.util.LocalDate",
            example = "2021-01-01",
            allowEmptyValue = true,
            required = false)
    public LocalDate getCreationDate() {return creationDate;}


    @JsonIgnore
    public AccountType getAccountType() {return accountType;}

    public void setAccountType(AccountType accountType) {this.accountType = accountType;}
    public void setAccountTypeName(String accountTypeName) {this.accountTypeName = accountTypeName;}
    public void setMnemonic(String mnemonic) {this.mnemonic = mnemonic;}
    public void setCreationDate(LocalDate creationDate) {this.creationDate = creationDate;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mnemonic, accountTypeName, creationDate);
    }

    @Override
    public String toString() {
        return "AccountTypeDto{" +
                "mnemonic='" + mnemonic + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
