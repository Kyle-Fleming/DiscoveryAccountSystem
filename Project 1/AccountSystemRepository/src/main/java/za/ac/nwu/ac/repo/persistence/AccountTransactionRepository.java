package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Number> {

    //TODO: create queries for database to fetch account transactions and add new ones(positive and negative)
/*
    Query examples:
    INSERT INTO "KYLE"."ACCOUNT_TRANSACTION" (TX_ID, MEMBER_ID, AMOUNT, TX_DATE) VALUES ('3', '2', '25', TO_DATE('2021-10-03 00:00:00', 'YYYY-MM-DD HH24:MI:SS'))*/
}
