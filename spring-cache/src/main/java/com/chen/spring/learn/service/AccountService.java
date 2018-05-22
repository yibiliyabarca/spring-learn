package com.chen.spring.learn.service;

import com.chen.spring.learn.bean.Account;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by chenxingyu on 2018/5/22.
 */
@Component
public class AccountService {
    @Cacheable(value="myCache")// 使用了一个缓存名叫 accountCache
    public Account getAccountByName(String userName) {
        // 方法内部实现不考虑缓存逻辑，直接实现业务
        return getFromDB(userName);
    }

    @CacheEvict(value = "myCache" , key = "#userName")
    public void updateAccount(String userName, Account account){
        System.out.println("update account in DB,userName:" + userName);
    }

    @CachePut(value = "myCache", key = "#userName")
    public Account getAccountAndSetCahe(String userName, Account account){
        System.out.println("update account in DB,userName:" + userName);
        return account;
    }

    private Account getFromDB(String acctName) {
        System.out.println("real querying db..."+acctName);
        return new Account(acctName);
    }
}
