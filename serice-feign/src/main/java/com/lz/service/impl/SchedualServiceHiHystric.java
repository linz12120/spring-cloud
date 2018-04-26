package com.lz.service.impl;

import com.lz.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClinetOne(String name) {
        return "sorry "+name;
    }
}
