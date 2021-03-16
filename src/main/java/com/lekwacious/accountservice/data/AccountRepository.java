package com.lekwacious.accountservice.data;

import com.lekwacious.accountservice.data.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<Account, Integer> {
}
