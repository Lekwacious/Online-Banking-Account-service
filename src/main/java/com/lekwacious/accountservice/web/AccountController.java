package com.lekwacious.accountservice.web;

import com.lekwacious.accountservice.data.AccountRepository;
import com.lekwacious.accountservice.data.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping(value = "/account/acount-type/{type")
    public List<Account> findByAccountType(@PathVariable String type){
        return accountRepository.findAccountByAccountType(type);
    }

    @GetMapping(value = "/account/bank{bank}")
    public List<Account> findByBank(@PathVariable String bank){
        return accountRepository.findByBank(bank);
    }

    @GetMapping(value = "/account/customer/{customer}")
    public List<Account> findByCustomer(@PathVariable Integer customer){
        return (List<Account>) accountRepository.findAllByCustomerId(customer);
    }
}
