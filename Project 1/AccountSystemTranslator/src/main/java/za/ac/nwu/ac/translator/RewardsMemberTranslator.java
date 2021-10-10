package za.ac.nwu.ac.translator;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.RewardsMember;

@Component
public interface RewardsMemberTranslator {
    RewardsMember getRewardsMemberById(Number id);

}
