package com.spring.aop.spring.aop.business;

import com.spring.aop.spring.aop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {
        return dao2.retrieveSomething();
    }
}
