package com.spring.aop.spring.aop.data;

import com.spring.aop.spring.aop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething() {
        return "Dao1";
    }
}
