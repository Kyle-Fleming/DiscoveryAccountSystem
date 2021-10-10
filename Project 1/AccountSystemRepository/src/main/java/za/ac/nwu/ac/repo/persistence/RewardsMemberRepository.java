package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.RewardsMember;

@Repository
public interface RewardsMemberRepository extends JpaRepository<RewardsMember, Number> {

    @Query(value ="SELECT"+
            "           rm"+
            "           FROM"+
            "           RewardsMember rm"+
            "   WHERE rm.discoveryId = :id")
    RewardsMember getRewardsMemberById(Number id);



}
