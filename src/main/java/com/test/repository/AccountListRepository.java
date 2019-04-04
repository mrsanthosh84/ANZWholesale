package com.test.repository;

import com.test.model.AccountListEnquiry;
import com.test.model.AccountTransactionEnquiry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by smanicka on 3/4/19.
 */
public interface AccountListRepository extends MongoRepository<AccountListEnquiry, String> {
    List<AccountListEnquiry> findAll();
    @Query("{accountNumber: ?0}")
    List<AccountListEnquiry> findAccountTransactionByAccountNumber(Integer accountNumber);
}
