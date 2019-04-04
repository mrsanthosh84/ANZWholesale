package com.test.repository;

import com.test.model.AccountTransactionEnquiry;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by smanicka on 3/4/19.
 */
public interface AccountTransactionRepository extends MongoRepository<AccountTransactionEnquiry, String> {
    List<AccountTransactionEnquiry> findAll();
}
