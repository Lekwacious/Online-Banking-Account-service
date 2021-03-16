package com.lekwacious.accountservice.web;

import com.lekwacious.accountservice.data.AccountRepository;
import com.lekwacious.accountservice.data.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @PostMapping(value = "/account")
    public Account save(@RequestBody Account account){
        return accountRepository.save(account);
    }

    @GetMapping(value = "/account")
    public Iterable<Account> allAccounts(){
        return accountRepository.findAll();
    }
    @GetMapping(value = "account/{accountId}")
    public Optional<Account> findByAccountId(@PathVariable Integer accountId){
        return accountRepository.findById(accountId);
    }

    @GetMapping(value = "/account")
    public Account updateAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }
    @DeleteMapping(value = "/account")
    public void deleteAccount(@RequestBody Account account){
      accountRepository.delete(account);
    }
}
