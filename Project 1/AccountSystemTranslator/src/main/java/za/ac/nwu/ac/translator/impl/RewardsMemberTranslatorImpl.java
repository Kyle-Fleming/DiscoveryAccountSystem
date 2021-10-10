package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.RewardsMember;
import za.ac.nwu.ac.repo.persistence.RewardsMemberRepository;
import za.ac.nwu.ac.translator.RewardsMemberTranslator;

@Component
public class RewardsMemberTranslatorImpl implements RewardsMemberTranslator {

    private final RewardsMemberRepository rewardsMemberRepository;

    @Autowired
    public RewardsMemberTranslatorImpl(RewardsMemberRepository rewardsMemberRepository) {
        this.rewardsMemberRepository = rewardsMemberRepository;
    }

    @Override
    public RewardsMember getRewardsMemberById(Number id) {
        try {
            RewardsMember rewardsMember = new RewardsMember();
            rewardsMember = rewardsMemberRepository.getRewardsMemberById(id);
            return rewardsMember;


        } catch (Exception e) {
            throw new RuntimeException("Unable to read from database, translator layer", e);
        }
    }
}
