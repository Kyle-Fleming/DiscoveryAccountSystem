package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountTypeDto, Long> {

    public default String getAccountTypeByMnemonic(String mnemonic){
        return AccountTypeDto.class.getTypeName();
    }

}
