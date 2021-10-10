package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "REWARDS_MEMBER", schema = "KYLE")
public class RewardsMember {
    private Number discoveryId;
    private Number balance;
    private String memberName;

    public RewardsMember() {
    }

    public RewardsMember(Number discoveryId, Number balance, String memberName) {
        this.discoveryId = discoveryId;
        this.balance = balance;
        this.memberName = memberName;
    }
    //GETTER METHODS
    @Id
    @SequenceGenerator(name = "REWARDS_MEMBER_SEQ", sequenceName = "KYLE.REWARDS_MEMBER_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REWARDS_MEMBER_SEQ")
    @Column(name = "DISCOVERY_ID")
    public Number getDiscoveryId() {return discoveryId;}

    @Column(name = "BALANCE")
    public Number getBalance() {return balance;}

    @Column(name = "MEMBER_NAME")
    public String getMemberName() {return memberName;}

    //SETTER METHODS
    public void setDiscoveryId(Number discoveryId) {this.discoveryId = discoveryId;}
    public void setBalance(Number balance) {this.balance = balance;}
    public void setMemberName(String memberName) {this.memberName = memberName;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardsMember that = (RewardsMember) o;
        return Objects.equals(discoveryId, that.discoveryId) && Objects.equals(balance, that.balance) && Objects.equals(memberName, that.memberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discoveryId, balance, memberName);
    }
}
