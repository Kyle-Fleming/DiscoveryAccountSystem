package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long> {

    //TODO: create queries for database to fetch account transactions and add new ones(positive and negative)
//    @Query(value = "SELECT * FROM ACCOUNT_TRANSACTION")
//    AccountTransaction getAllTransactions();
//
//    @Query(value = "SELECT * FROM ACCOUNT_TRANSACTION WHERE ACCOUNT_TRANSACTION.MEMBER_ID = :ID")
//    AccountTransaction getAccountTransactionByMemberID(int ID);
}
