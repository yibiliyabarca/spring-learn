package com.chen.spring.learn.service;

import com.chen.spring.learn.bean.Account;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by chenxingyu on 2018/5/22.
 */
@Component
public class AccountService {
    @Cacheable(value="default")// 使用了一个缓存名叫 accountCache
    public Account getAccountByName(String userName) {
        // 方法内部实现不考虑缓存逻辑，直接实现业务
        System.out.println("real query account."+userName);
        return getFromDB(userName);
    }

    private Account getFromDB(String acctName) {
        System.out.println("real querying db..."+acctName);
        return new Account(acctName);
    }
}
