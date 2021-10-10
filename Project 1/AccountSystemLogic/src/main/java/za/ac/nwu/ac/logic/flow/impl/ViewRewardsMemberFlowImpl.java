package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.RewardsMember;
import za.ac.nwu.ac.logic.flow.ViewRewardsMemberFlow;
import za.ac.nwu.ac.translator.RewardsMemberTranslator;

import javax.transaction.Transactional;

@Transactional
@Component("ViewRewardsMemberFlow")
public class ViewRewardsMemberFlowImpl implements ViewRewardsMemberFlow {

    private final RewardsMemberTranslator rewardsMemberTranslator;

    @Autowired
    public ViewRewardsMemberFlowImpl(RewardsMemberTranslator rewardsMemberTranslator) {
        this.rewardsMemberTranslator = rewardsMemberTranslator;
    }



    @Override
    public RewardsMember getRewardsMemberById(Number id) {
        return rewardsMemberTranslator.getRewardsMemberById(id);
    }
}
