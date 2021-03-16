package com.lekwacious.accountservice.data;

import com.lekwacious.accountservice.data.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository  extends JpaRepository<Account, Integer> {
    List<Account> findAccountByCustomerId(Integer customerId);

    List<Account>findAccountByAccountType(String accountType);

    List<Account> findByBank(String bank);

    Account findAllByCustomerId(Integer accountId);
}
