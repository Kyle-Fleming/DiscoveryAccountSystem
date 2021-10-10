package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.ac.domain.persistence.RewardsMember;

import java.io.Serializable;
import java.util.Objects;

@ApiModel(value = "RewardsMember",
        description = "A DTO that represents RewardsMember")
public class RewardsMemberDto implements Serializable {
    private String memberName;
    private Number balance;

    private RewardsMember rewardsMember;

    public RewardsMemberDto() {
    }

    public RewardsMemberDto(String memberName, Number balance) {
        this.memberName = memberName;
        this.balance = balance;
    }

    public RewardsMemberDto(RewardsMember rewardsMember) {
        this.setBalance(rewardsMember.getBalance());
        this.setMemberName(rewardsMember.getMemberName());
    }

    @ApiModelProperty(position = 1,
            value =    "RewardsMember MemberName",
            name =     "MemberName",
            notes =    "Name of rewards member",
            dataType = "java.lang.String",
            example =  "Kyle",
            required = false)
    public String getMemberName() {return memberName;}

    @ApiModelProperty(position = 2,
            value =    "RewardsMember balance",
            name =     "balance",
            notes =    "Current balance of Rewards member",
            dataType = "java.lang.Number",
            example =  "250",
            required = false)
    public Number getBalance() {return balance;}

    @JsonIgnore
    public RewardsMember getRewardsMember() {
        return new RewardsMember();
    }

    //setter methods
    public void setMemberName(String memberName) {this.memberName = memberName;}
    public void setRewardsMember(RewardsMember rewardsMember) {this.rewardsMember = rewardsMember;}
    public void setBalance(Number balance) {this.balance = balance;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardsMemberDto that = (RewardsMemberDto) o;
        return Objects.equals(memberName, that.memberName) && Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberName, balance);
    }

    @Override
    public String
    toString() {
        return "RewardsMemberDto{" +
                "memberName='" + memberName + '\'' +
                ", balance=" + balance +
                '}';
    }

}
