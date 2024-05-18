package com.kbw0226.managerpg.domain.account.repository;

import com.kbw0226.managerpg.domain.account.entitiy.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;


public interface AccountRepository extends MongoRepository<Account, UUID> {
}
