package com.ibm.demo.repository;

import com.ibm.demo.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {

    Account findByPhone(String phone);
    Account findByPhoneAndPassword(String phone,String password);

}
